import java.util.*;

public class Main {
	void doIt() {
		Scanner in = new Scanner(System.in);
		Person[][] personArray = new Person[3][8]; //選手の番号とタイムを格納
		Person[] sub = new Person[18]; //決勝にいけなかった選手を格納
		for (int i=0; i<3; i++) { //各組
			for (int j=0; j<8; j++) { //各組の選手
			int tmpname = in.nextInt();
			String tmptime = in.next();
			personArray[i][j] = new Person(tmpname, tmptime);
			}
			Arrays.sort(personArray[i]); //タイムの速い順に並べ替える
			System.out.println(personArray[i][0]); //１番目の選手
			System.out.println(personArray[i][1]);
			for (int j=i*6, k=2; j<(i+1)*6; j++,k++) { //決勝にいけなかった選手を組関係なく全て格納
				sub[j] = personArray[i][k];
			}
		}
		Arrays.sort(sub);
		System.out.println(sub[0]);
		System.out.println(sub[1]);
	}
	public static void main(String[] args) {
		new Main().doIt();
	}
	class Person implements Comparable<Person> {
		int name;
		String time;
		Person (int name, String time) {
				this.name = name;
				this.time = time;
		}
		@Override
		public String toString() {
			return name + " " + time;
		}
		@Override
		public int compareTo(Person o) {
			return time.compareTo(o.time);
		}
	}
}