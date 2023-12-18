import java.util.Scanner;
import java.util.Arrays;

public class Main {
	Scanner sc = new Scanner(System.in);
	Person [][] PersonArray = new Person[3][8];
	Person [] PersonArray2 = new Person[6];
	
	void input(){
		for(int i = 0 ; i < 3 ; i++){
			for(int j = 0 ; j < 8 ; j++){
				PersonArray[i][j] = new Person(sc.nextInt() , sc.next()); 
			}
		}
	}
	
	void sort(){
		Arrays.sort(PersonArray[0]);
		Arrays.sort(PersonArray[1]);
		Arrays.sort(PersonArray[2]);
	}
	
	void sort2(){
		PersonArray2[0] = new Person(PersonArray[0][2].Number , PersonArray[0][2].Time);
		PersonArray2[1] = new Person(PersonArray[0][3].Number , PersonArray[0][3].Time);
		PersonArray2[2] = new Person(PersonArray[1][2].Number , PersonArray[1][2].Time);
		PersonArray2[3] = new Person(PersonArray[1][3].Number , PersonArray[1][3].Time);
		PersonArray2[4] = new Person(PersonArray[2][2].Number , PersonArray[2][2].Time);
		PersonArray2[5] = new Person(PersonArray[2][3].Number , PersonArray[2][3].Time);
		Arrays.sort(PersonArray2);
	}
	
	void output(){
		System.out.println(PersonArray[0][0]);
		System.out.println(PersonArray[0][1]);
		System.out.println(PersonArray[1][0]);
		System.out.println(PersonArray[1][1]);
		System.out.println(PersonArray[2][0]);
		System.out.println(PersonArray[2][1]);
		System.out.println(PersonArray2[0]);
		System.out.println(PersonArray2[1]);
	}
	
	void doIt(){
		input();
		sort();
		sort2();
		output();
	}
	
	public static void main(String[] args){
		new Main().doIt();
	}
	
	class Person implements Comparable<Person>{
		int Number;
		String Time;
		Person(int Number , String Time){
			this.Number = Number;
			this.Time = Time;	
		}
		
		@Override
		public int compareTo(Person p){
			return Time.compareTo(p.Time);
		}
		
		@Override
		public String toString(){
			return Number + " " + Time;
		}
		
	}
	
}