
import java.util.Arrays;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		label:while(true){
			Shop[] s = new Shop[5];
			for(int i = 0;i<5;i++){
				int a = cin.nextInt();
				int b = cin.nextInt();
				if(i+a+b==0){
					break label;
				}
				s[i]=new Shop(a+b, (char)('A'+i));
			}
			Arrays.sort(s);
			System.out.println(s[4].name+" " + s[4].total);
		}

	}

}
class Shop implements Comparable{
	int total;
	char name;
	Shop(int a, char b){
		total=a;name=b;
	}
	
	public int compareTo(Object o){
		Shop s = (Shop)o;
		return this.total-s.total;
		
	}
	
}