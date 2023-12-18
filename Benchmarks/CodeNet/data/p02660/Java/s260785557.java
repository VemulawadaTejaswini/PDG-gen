import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	static int counter=0;
	static void culsosu(int num) { //ある因数の数を受け取って割れる最大数をcounterに足す関数
		for(int k=1; num>0; k++) {
			counter++;
			num = num-k-1;
			
		}		
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long N = s.nextLong();
		ArrayList sosus = new ArrayList();

		for(int i=2; i<=N; i++) {
			while(N%i == 0 ) {
				sosus.add(i);
				N = N/i;
			}
		}
		/*for(int i=0; i<sosus.size(); i++) {
			System.out.print(sosus.get(i));		
		}
		System.out.println(); */
		
	
		
		int num=1;
		for(int i=0; i<sosus.size()-1; i++) {
			
			if(sosus.get(i) == sosus.get(i+1)) {
				num++;
				if(i== sosus.size()-2) {
					culsosu(num);
					num=1;
				}
			}
			else {
				culsosu(num);
				num=1;
				if(i== sosus.size()-2) {counter++;}
				}
			    
		
			
		}
		if(sosus.size() ==1) {
			counter++;
		}

		/*for(int i=0; i<sosus.size(); i++) {
			System.out.print(sosus.get(i));
		} */


		System.out.println(counter);

	}

}
