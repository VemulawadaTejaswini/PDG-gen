import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		new AOJ01001().doIt();
	}
	
	class AOJ01001{
		void doIt(){
			while(in.hasNext()){
				int n = in.nextInt();
				if(n==0)break;
				ArrayList<Person> list = new ArrayList<Main.Person>();
				for(int i=0;i<n;i++){
					int id = in.nextInt();
					int num = in.nextInt() * in.nextInt();
					boolean flg = false;
					for(int s=0;s<list.size();s++)if(list.get(s).id == id){
						flg = true;
						list.get(s).increment(num);
						break;
					}
					if(!flg){
						Person p = new Person(id);
						p.increment(num);
						list.add(p);
					}
				}
				boolean flg = false;
				for(int i=0;i<list.size();i++)if(list.get(i).sum>=1000000){
					flg = true;
					System.out.println(list.get(i).id);
				}
				if(!flg)System.out.println("NA");
			}
		}
	}
	
	class Person{
		long sum;
		int id;
		public Person(int _id) {
			sum = 0;
			id = _id;
		}
		
		void increment(int num){
			sum += num;
		}
		
	}
	
}