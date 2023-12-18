
import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	void doIt(){
		Person [] record = new Person[24];
		for(int i=0;i<24;i++){
			record[i] = new Person(sc.nextInt(),sc.nextDouble());
		}
		Arrays.sort(record,0,7);
		System.out.println(record[0].toString() + "\n" + record[1].toString());
		Arrays.sort(record,8,15);
		System.out.println(record[8].toString() + "\n" + record[9].toString());
		Arrays.sort(record,16,23);
		System.out.println(record[16].toString() + "\n" + record[17].toString());
		Arrays.sort(record);
		System.out.println(record[0].toString() + "\n" + record[1].toString());		
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
			time = 99.99;
			return number + " " + record;
		}
		@Override
		public int compareTo(Person o) {
			return time.compareTo(o.time);
		}
	}
}