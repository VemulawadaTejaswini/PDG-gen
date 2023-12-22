
import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] a  = new int [N];
		for(int i=0; i<N; i++){
			a[i] = sc.nextInt();
		}
		int konkansize = 0;
		//??????????????????
		boolean flag = true;
		while(flag){
			flag = false;
			for(int j=N-1; j>0; j--){
				if(a[j] < a[j-1]){
					int ste = a[j];
					a[j] = a[j-1];
					a[j-1] = ste;  
					konkansize++;
					flag = true;
				}
			}
		}
		for(int i=0; i<N-1; i++){
			System.out.print(a[i] + " ");
		}
		System.out.println(a[N-1]);
		System.out.println(konkansize);
		sc.close();
	}
}