import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []a = new int[n];
		for(int b = 0; b<n ; ++b){
			a[b]=sc.nextInt();
		}
		for(int b=n-1 ; b>=0 ; --b){
			if(b!=0){
				System.out.print(a[b]+" ");
			}else{
				System.out.println(a[b]);
			}
		}
	}

}