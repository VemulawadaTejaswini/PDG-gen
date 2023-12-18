import java.util.*;
public class Main {
	void doIt(){
		Scanner sc = new Scanner(System.in);
		Person pa[][] = new Person[3][8];
		Person pa1[] = new Person[24];
		for(int i = 0;i < 3;i++){
			for(int k = 0;k < 8;k++){
				pa[i][k] = new Person(sc.nextInt(), sc.nextDouble());
				pa1[i * 8 + k] = pa[i][k];
			}
			Arrays.sort(pa[i]);
			System.out.println(pa[i][0].number + " " + pa[i][0].time);
			System.out.println(pa[i][1].number + " " + pa[i][1].time);
		}
		Arrays.sort(pa1);
		System.out.println(pa1[6].number + " " + pa1[6].time);
		System.out.println(pa1[7].number + " " + pa1[7].time);
	}
	public static void main(String args[]){
		new Main().doIt();
	}
	class Person implements Comparable<Person>{
		int number;
		double time;
		Person(int number, double time){
			this.number = number;
			this.time = time;
		}
		@Override
		public String toString(){
			return number + " " + time;
		}
		@Override
		public int compareTo(Person p){
			return time.compareTo(p.time);
		}
	}
}