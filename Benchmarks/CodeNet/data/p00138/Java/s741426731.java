import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	
	public static class Person implements Comparable<Person>{
		public int number;
		public double time;
		
		public Person(int n, double t){
			number = n;
			time = t;
		}

		@Override
		public int compareTo(Person another) {	
			return this.time < another.time ? -1
					: this.time == another.time ? 0
							: 1;
		}
		
		public String toString(){
			return number + " " + String.format("%.2f",time);
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Person> one_list = new ArrayList<Person>(8);
		ArrayList<Person> two_list = new ArrayList<Person>(8);
		ArrayList<Person> three_list = new ArrayList<Person>(8);
		ArrayList<Person> other_list = new ArrayList<Person>(24);
		
		for(int i = 0; i < 24; i++){
			Person input = new Person(sc.nextInt(),sc.nextDouble());
			
			switch(i / 8){
			case 0:
				one_list.add(input);
				break;
			case 1:
				two_list.add(input);
				break;
			case 2:
				three_list.add(input);
				break;
			}
			
			other_list.add(input);
		}
		
		Collections.sort(one_list);
		Collections.sort(two_list);
		Collections.sort(three_list);
		
		other_list.remove(one_list.get(0));
		other_list.remove(one_list.get(1));
		other_list.remove(two_list.get(0));
		other_list.remove(two_list.get(1));
		other_list.remove(three_list.get(0));
		other_list.remove(three_list.get(1));
		
		Collections.sort(other_list);
		
		System.out.println(one_list.get(0));
		System.out.println(one_list.get(1));
		System.out.println(two_list.get(0));
		System.out.println(two_list.get(1));
		System.out.println(three_list.get(0));
		System.out.println(three_list.get(1));
		System.out.println(other_list.get(0));
		System.out.println(other_list.get(1));
	}
	
}