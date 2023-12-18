import java.util.*;
public class Main {
	void doIt(){
		Scanner sc = new Scanner(System.in);
		Person pa[][] = new Person[3][8];
		Person pa1[] = new Person[24];
		int cnt = 0;
		for(int i = 0;i < 3;i++){
			for(int k = 0;k < 8;k++){
				pa[i][k] = new Person(sc.nextInt(), sc.nextDouble(), true);
			}
			System.out.println("------"+i+"------");
			Arrays.sort(pa[i]);
			pa[i][0].flag = false;
			pa[i][1].flag = false;
			System.out.println(pa[i][0].number + " " + pa[i][0].time);
			System.out.println(pa[i][1].number + " " + pa[i][1].time);
			for(int k = 0;k < 8;k++){
				pa1[i * 8 + k] = pa[i][k];
			}
		}
		Arrays.sort(pa1);
		System.out.println("------------");
		for(int i = 0;i < 24;i++){
			if(pa1[i].flag == true){
				System.out.println(pa1[i].number + " " + pa1[i].time);
				cnt++;		
			}
			if(cnt == 2) break;
		}
	}
	public static void main(String args[]){
		new Main().doIt();
	}
	class Person implements Comparable<Person>{ 
		int number;
		Double time;
		boolean flag;
		Person(int number, double time, boolean flag){
			this.number = number;
			this.time = time;
			this.flag = flag;
		}
/*		@Override
		public String toString(){
			return number + " " + time;
		}*/
		@Override
		public int compareTo(Person p){
			return time.compareTo(p.time);
		}
	}
}