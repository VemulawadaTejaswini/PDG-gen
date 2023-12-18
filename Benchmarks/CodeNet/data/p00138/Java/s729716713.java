
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	void doIt(){
		Person [][] record = new Person[3][8];
		Person [] others = new Person[6];
		int c=0;
		for(int i=0;i<3;i++){
			for(int j=0;j<8;j++){
				record[i][j] = new Person(sc.nextInt(),sc.nextDouble());
			}
		}
		for(int i=0;i<3;i++){
			Arrays.sort(record[i],0,7);
			System.out.println(record[i][0].toString() + "\n" + record[i][1].toString());
			others[c++] = record[i][2];
			others[c++] = record[i][3];
		}
		Arrays.sort(others);
		System.out.println(others[0].toString() + "\n" + others[1].toString());		
	}

	public static void main(String[] args) {
		new Main().doIt();
	}
	
	class Person implements Comparable<Person>{
		int number;
		Double time;
		Person(int number , double time){
			this.number = number;
			this.time = time;
		}
		@Override
		public String toString() {
			double record = time;
			return number + " " + record;
		}
		@Override
		public int compareTo(Person o) {
			return time.compareTo(o.time);
		}
	}
}