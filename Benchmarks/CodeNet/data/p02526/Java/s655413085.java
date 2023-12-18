//AOJ10030FñðJEg·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] search = new int[n];
		for(int i=0; i < n; i++){
			search[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int count =0;

		for(int i=0; i < m; i++){

			int patt = sc.nextInt();
			for(int j =0; j < n; j++){
				if(search[j] == patt){
					count++;
					break;
				}
			}
		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}