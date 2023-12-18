import java.util.Scanner;
import java.util.Deque;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		Data list;
		if (sc.nextByte() == 0 & sc.nextByte() < 2) {
			list = new FirstData(sc.nextLong());
		} else {
			list = new FirstData();
		}
		Data dataTmp = list;
		Data swapTmp = list;
		Data getList = list;
		Data firstPosition = list;
		Data endPosition = list;
		Data centorPosition = list;
		Data quarterPosition = list;
		Data threeQuartersPositon = list;
		int tmpNum;
		Deque<Long> outArray = new ArrayDeque<Long>();
		int outCount = 0;
		int start = 0;
		int last = 0;
		boolean resetFlag = false;
		for (int i = 1; i < q; i++) {
			while (firstPosition.pivot != start) {
				firstPosition = back(firstPosition);
			}
			while (endPosition.pivot < last) {
				endPosition = advance(endPosition);
			}
			switch (sc.nextByte()) {
				case 0:
					if (resetFlag) {
						sc.nextByte();
						list = new FirstData(sc.nextLong());
						start = list.pivot;
						last = list.pivot;
						firstPosition = list;
						endPosition = list;
						centorPosition = list;
						quarterPosition = list;
						threeQuartersPositon = list;
						getList = list;
						resetFlag = false;
						break;
					}
					switch (tmpNum = sc.nextByte()) {
						case 0:
							list = firstPosition;
							list.prev = new Data(sc.nextLong(), list.prev.prev, list, --start);
							dataTmp = list.prev;
							list = endPosition;
							list.next = dataTmp;
							break;
						case 1:
							list = endPosition;
							list.next = new Data(sc.nextLong(), list, list.next.next, ++last);
							dataTmp = list.next;
							list = firstPosition;
							list.prev = dataTmp;
							break;
					}
					if (last - start >= 2) {
						centorPosition = move(centorPosition, (last - start) / 2 + start);
					}
					if (last - start >= 4) {
						quarterPosition = move(quarterPosition, (last - start) / 4 + start);
						threeQuartersPositon = move(threeQuartersPositon, (last - start) / 4 * 3 + start);
					}
					break;
				case 1:
					tmpNum = sc.nextInt() + start;
					if (Math.abs(tmpNum - getList.pivot) > Math.abs(tmpNum - list.pivot)) {
						getList = list;
					}
					if (Math.abs(tmpNum - getList.pivot) > Math.abs(tmpNum - firstPosition.pivot)) {
						getList = firstPosition;
					}
					if (Math.abs(tmpNum - getList.pivot) > Math.abs(tmpNum - endPosition.pivot)) {
						getList = endPosition;
					}
					if (Math.abs(tmpNum - getList.pivot) > Math.abs(tmpNum - centorPosition.pivot)) {
						getList = centorPosition;
					}
					
					if (Math.abs(tmpNum - getList.pivot) > Math.abs(tmpNum - quarterPosition.pivot)) {
						getList = quarterPosition;
					} else if (Math.abs(tmpNum - getList.pivot) > Math.abs(tmpNum - quarterPosition.pivot)) {
						getList = threeQuartersPositon;
					}
					if (getList.pivot < tmpNum) {
						while (getList.pivot != tmpNum) {
							getList = advance(getList);
						}
					} else if (getList.pivot > tmpNum) {
						while (getList.pivot != tmpNum) {
							getList = back(getList);
						}
					}
					outArray.addLast(getList.num);
					break;
				case 2:
					if (last - start <= 0) {
						sc.nextByte();
						resetFlag = true;
						break;
					}
					switch (sc.nextByte()) {
						case 0:
							firstPosition = firstPosition.next;
							break;
						case 1:
							endPosition = endPosition.prev;
							break;
					}
					firstPosition.prev = endPosition;
					endPosition.next = firstPosition;
					start = firstPosition.pivot;
					last = endPosition.pivot;
					break;
			}
		}
		for (long out : outArray) {
			System.out.println(out);
		}
	}
	
	public static Data advance(Data list) {
		return list.next;
	}
	
	public static Data move(Data list, int n) {
		if (list.pivot < n) {
			while (list.pivot != n) {
				list = advance(list);
			}
		} else if (list.pivot > n) {
			while (list.pivot != n) {
				list = back(list);
			}
		}
		return list;
	}
	
	public static Data back(Data list) {
		return list.prev;
	}
}

class Data {
	int pivot;
	long num;
	Data prev;
	Data next;
	
	public Data(long n, Data prev, Data next, int m) {
		pivot = m;
		num = n;
		this.prev = prev;
		this.next = next;
	}
	
	public Data() {
	}
}

class FirstData extends Data {
	public FirstData(long n) {
		pivot = 0;
		num = n;
		prev = this;
		next = this;
	}
	
	public FirstData() {
		pivot = 0;
		num = 0;
		prev = this;
		next = this;
	}
}

