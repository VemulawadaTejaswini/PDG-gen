import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

class Main {

	public static void main(String... args) {
		List<Integer> targetGroupNumberList = getInputList();
		int maxGroupNumber = Collections.max(targetGroupNumberList);

		Fukushimaken fukushimaken = new Fukushimaken();
		List<Group> groupList = new ArrayList<Group>();

		int elapsedTime = 0;
		int groupNumber = 0;
		while (true) {
			if (elapsedTime % 5 == 0) {
				groupNumber = elapsedTime / 5;
				Group group = new Group(groupNumber);
				groupList.add(group);
				
				fukushimaken.receive(group);
			}
			fukushimaken.refresh(elapsedTime);

			if (maxGroupNumber <= groupNumber
					&& groupList.get(maxGroupNumber).haveStartedEating()) {
				// 対象となるグループ番号の待ち時間が全て取得できた段階で終了する
				break;
			}
			elapsedTime++;
		}

		for (int i : targetGroupNumberList) {
			Group group = groupList.get(i);
			int waitTime = group.getWaitTime();
			System.out.println(waitTime);
		}
	}
	
	static List<Integer> getInputList() {
		Scanner scanner = null;
		List<Integer> inputList = new ArrayList<Integer>();
		try {
			scanner = new Scanner(System.in);
			while (scanner.hasNext()) {
				String line = scanner.nextLine();
				inputList.add(Integer.parseInt(line));
			}
			return inputList;
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
	}

	static class Fukushimaken {
		private List<Boolean> tables = new ArrayList<Boolean>(17); // 座席（Falseであれば空席となる）
		private List<Group> groupAtTable = new ArrayList<Group>(); // 着席しているグループ
		private LinkedList<Group> groupQueue = new LinkedList<Group>(); // 並んでいるグループ

		Fukushimaken() {
			for (int i = 0; i < 17; i++) {
				tables.add(false);
			}
		}

		void receive(Group group) {
			this.groupQueue.offer(group);
		}

		void refresh(int elapsedTime) {
			this.refreshTables(elapsedTime);
			this.refreshQueue(elapsedTime);
			for (Group group : this.groupQueue) {
				// 行列にいるグループに待ち時間を加算する
				group.addWaitTime();
			}
		}

		private void refreshTables(int elapsedTime) {
			// 食事の済んだグループの座席を空席とする
			for (int i = 0; i < this.groupAtTable.size(); i++) {
				Group group = this.groupAtTable.get(i);
				if (!group.haveFinishedMeal(elapsedTime)) {
					continue;
				}
				Set<Integer> tableNumbers = group.getUseTableNumbers();
				for (int j : tableNumbers) {
					this.tables.set(j, false);
				}
				this.groupAtTable.remove(i);
			}
		}

		private void refreshQueue(int elapsedTime) {
			Group group = this.groupQueue.peek();
			if (group == null) {
				return;
			}
			Set<Integer> emptyTableNumbers = this.getEmptyTablesNumbers(group.getSize());
			if (emptyTableNumbers.size() == 0) {
				return;
			}
			
			// 座席が空いていれば行列の先頭から順に着席する
			this.groupAtTable.add(group);
			group.startEating(emptyTableNumbers, elapsedTime);
			this.groupQueue.removeFirst();
			for (int i : emptyTableNumbers) {
				this.tables.set(i, true);
			}
			this.refreshQueue(elapsedTime);
		}

		private Set<Integer> getEmptyTablesNumbers(int size) {
			// 席の番号が小さいほうから空いている座席を探す
			Set<Integer> tableNumbers = new HashSet<Integer>();
			for (int i = 0; i < this.tables.size(); i++) {
				boolean isNotEmpty = this.tables.get(i);
				if (isNotEmpty) {
					tableNumbers.clear();
					continue;
				}
				tableNumbers.add(i);
				if (size <= tableNumbers.size()) {
					return tableNumbers;
				}
			}
			return new HashSet<Integer>();
		}
	}

	static class Group {

		private int number; // グループ番号
		private int timeToEat; // 食事にかかる時間
		private int endingTime; // 食事が済む時点の経過時間
		private Set<Integer> useTableNumbers; // 使用している座席の番号
		private int waitTime; // 待ち時間

		Group(int number) {
			this.number = number;
			this.timeToEat = 17 * (this.number % 2) + 3 * (this.number % 3) + 19;
		}

		void startEating(Set<Integer> tableNumbers, int elapsedTime) {
			// 着席し、さっそく食事を始める。この時点でこのグループの待ち時間は確定する。
			this.useTableNumbers = tableNumbers;
			this.endingTime = elapsedTime + timeToEat;
		}

		boolean haveFinishedMeal(int elapsedTime) {
			return this.endingTime <= elapsedTime;
		}

		Set<Integer> getUseTableNumbers() {
			return this.useTableNumbers;
		}

		boolean haveStartedEating() {
			return this.useTableNumbers != null;
		}

		void addWaitTime() {
			this.waitTime++;
		}

		int getWaitTime() {
			return this.waitTime;
		}

		int getSize() {
			return (this.number % 5 == 1) ? 5 : 2; // グループの人数
		}
	}
}