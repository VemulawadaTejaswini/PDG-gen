import java.util.*;
import java.io.*;

class Dice
{
	int[] xIndices = new int[4];
	int[] yIndices = new int[4];
	String[] numIndicesMap = new String[6];

	static void move(int direction, int[] indices) {
		if (direction > 0) {
			direction = 1;
			for (int i = 1; i < indices.length; ++i) {
				int tmp = indices[i-1]; // javaはswapを書けないのか？
				indices[i-1] = indices[i];
				indices[i] = tmp;
			}
		}
		if (direction < 0) {
			for (int i = indices.length - 1; i > 0; --i) {
				int tmp = indices[i-1]; // javaはswapを書けないのか？
				indices[i-1] = indices[i];
				indices[i] = tmp;
			}
		}
	}
	void moveX(int direction) {
		move(direction, xIndices);
		yIndices[0] = xIndices[0];
		yIndices[2] = xIndices[2];
	}
	void moveY(int direction) {
		move(direction, yIndices);
		xIndices[0] = yIndices[0];
		xIndices[2] = yIndices[2];
	}

	public Dice(String[] mapper) throws Exception {
		yIndices[0] = 0;
		yIndices[1] = 1;
		yIndices[2] = 5;
		yIndices[3] = 4;

		xIndices[0] = 0;
		xIndices[1] = 3;
		xIndices[2] = 5;
		xIndices[3] = 2;

		if (mapper.length != 6) {
			throw new Exception("invalid mapper");
		}
		numIndicesMap = mapper;
	}

	public void move(char directionCharactor) throws Exception {
		switch (directionCharactor) {
			case 'N':
				moveY(1);
				return;
			case 'S':
				moveY(-1);
				return;
			case 'E':
				moveX(1);
				return;
			case 'W':
				moveX(-1);
				return;
			default:
				throw new Exception("invalid input");
		}
	}
	// インスタンスのコピーができれば要らないメソッド。
	// javaやc#に詳しくないので元に戻すことを自力で行う。
	public void moveReverse(char directionCharactor) throws Exception {
		switch (directionCharactor) {
			case 'N':
				moveY(-1);
				return;
			case 'S':
				moveY(1);
				return;
			case 'E':
				moveX(-1);
				return;
			case 'W':
				moveX(1);
				return;
			default:
				throw new Exception("invalid input");
		}
	}

	public String getTop() {
		return numIndicesMap[xIndices[0]];
	}
	public String getBottom() {
		return numIndicesMap[xIndices[2]];
	}
	public String getRight() {
		return numIndicesMap[xIndices[3]];
	}
	public String getLeft() {
		return numIndicesMap[xIndices[1]];
	}
	public String getFront() {
		return numIndicesMap[yIndices[1]];
	}
	public String getBack() {
		return numIndicesMap[yIndices[3]];
	}
}

class DiceComparator {
	class Snap {
		public String[] faces = new String[6];

		public Snap(Dice dice) {
			faces[0] = dice.getTop();
			faces[1] = dice.getBottom();
			faces[2] = dice.getRight();
			faces[3] = dice.getLeft();
			faces[4] = dice.getFront();
			faces[5] = dice.getBack();
		}

		public boolean equals(Object obj) {
			if(obj instanceof Snap) {
				Snap rhs = (Snap)obj;
				for (int i = 0; i < faces.length; ++i) {
					if (faces[i].equals(rhs.faces[i]) == false) {
						return false;
					}
				}
				return true;
			}
			return     false;
		}
		public int hashCode() {
			int hash = 0;
			for (String f : faces) {
				hash += f.hashCode();
			}
			return hash;
		}
	}

	char[] moves = { 'N', 'S', 'E', 'W' };
	Set<Snap> traversedChecker = new HashSet<Snap>();

	void traverse() throws Exception {
		for (int i = 0; i < moves.length; ++i) {
			dice.move(moves[i]);

			Snap snap = new Snap(dice);
			if (traversedChecker.contains(snap)) {
				continue;
			}
			traversedChecker.add(snap);

			traverse();

			dice.moveReverse(moves[i]);
		}
	}

	public Dice dice;
	DiceComparator(Dice dice) throws Exception {
		this.dice = dice;
		traverse();
	}

	public boolean isSame(Dice dice) {
		Snap snap = new Snap(dice);
		return traversedChecker.contains(snap);
	}

	// 以降のメソッドは問題に結びついているのでこのクラスからはがすことが望ましい
	public String findRight(String top, String front) {
		for(Snap s : traversedChecker) {
			// Snapに各面のアクセッサをつけるのを省略しました
			if(s.faces[0].equals(top) == false)  continue;
			if(s.faces[4].equals(front) == false)    continue;
			return  s.faces[2];
		}
		return  null;
	}

	public static boolean isSameDice(String[] indicesMapper0, String[] indicesMapper1) throws Exception {
		Dice dice0 = new Dice(indicesMapper0);
		Dice dice1 = new Dice(indicesMapper1);

		DiceComparator comparator = new DiceComparator(dice0);
		return comparator.isSame(dice1);
	}
	public static boolean isAllDifferentDice(List<String[]> indicesMappers) throws Exception {
		Dice dice0 = new Dice(indicesMappers.get(0));
		DiceComparator comparator = new DiceComparator(dice0);

		for (int i = 1; i < indicesMappers.size(); ++i) {
			Dice dice = new Dice(indicesMappers.get(i));
			if (comparator.isSame(dice)) {
				return false;
			}
		}

		return true;
	}
}

class A {
	public static void exec(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[]    indicesMapper =  br.readLine().split(" ");

		Dice dice = new Dice(indicesMapper);

		String  moves = br.readLine();
		for(int i = 0; i < moves.length(); ++i) {
			dice.move(moves.charAt(i));
		}

		System.out.println(dice.getTop());
	}
}
class B {
	public static void exec(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[]    indicesMapper =  br.readLine().split(" ");

		Dice dice = new Dice(indicesMapper);
		DiceComparator comparator = new DiceComparator(dice);

		int count = Integer.parseInt(br.readLine());
		for(int i = 0; i < count; ++i) {
			String[]    topFront = br.readLine().split(" ");
			String      right = comparator.findRight(topFront[0], topFront[1]);
			System.out.println(right);
		}
	}
}
class C {
	public static void exec(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[][]    inputs = new String[2][];
		inputs[0] = br.readLine().split(" ");
		inputs[1] = br.readLine().split(" ");

		String result = "No";
		if (DiceComparator.isSameDice(inputs[0], inputs[1])) {
			result = "Yes";
		}

		System.out.println(result);
	}
}
class D {
	public static void exec(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());
		List<String[]> indicesMappers = new ArrayList<>();

		for (int i = 0; i < count; ++i) {
			indicesMappers.add(br.readLine().split(" "));
		}

		String result = "No";
		if (DiceComparator.isAllDifferentDice(indicesMappers)) {
			result = "Yes";
		}

		System.out.println(result);
	}
}

public class Main {

	public static void main(String[] args) throws Exception {
		B.exec(args);
	}
}

