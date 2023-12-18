
import java.util.*;
public class Main {
	Scanner s = new Scanner(System.in);
		void doIt(){
			// 自作クラス(Person)オブジェクトの並べ替え
			Person []personone = new Person[8];
			Person []result = new Person[8];
			Person []three = new Person[6];
			int count = 0;
			for(int j=0; j<3; j++){
				for(int i=0; i<8; i++){
					personone[i] = new Person(s.nextInt(), s.nextDouble());
				}
				Arrays.sort(personone);
				result[count] = personone[0];
				result[count+1] = personone[1];
				three[count] = personone[2];
				three[count+1] = personone[3];
				count+=2;
			}
			Arrays.sort(three);
			result[6] = three[0];
			result[7] = three[1];
			for(int i=0; i<8; i++){
				System.out.println(result[i].number+" "+result[i].time);
			}
		}
		public static void main(String[] args) {
			new Main().doIt();
		}
		class Person implements Comparable<Person>{ 
			int number;
			Double time;
			Person(int number, double time) {
				this.number = number;
				this.time = time;
				}
			@Override
			public int compareTo(Person o){
				return time.compareTo(o.time);
			}
		}
}