//AOJ10031FñðJEg·évO
import java.util.*;
public class Main {

	public void doIt(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] search = new int[n];
		for(int i=0; i < n; i++){
			search[i] = sc.nextInt();
		}
		Arrays.sort(search);
		int m = sc.nextInt();
		int count =0;
		int [] patt = new int[m];
		for(int i=0; i < m; i++){
			patt[i] = sc.nextInt();
		}
		Arrays.sort(patt);
		int index =0;
		for(int i=0; i < n && index < m; i++){
			if(search[i] == patt[index]){
				count++;
				index++;
			}

		}
		System.out.println(count);

	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doIt();

	}

}