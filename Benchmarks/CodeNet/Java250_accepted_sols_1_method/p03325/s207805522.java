import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long a;
		int num =0;
		for(int i=0;i<n;i++){
			a = sc.nextInt();
			while(a%2 == 0){
				num += 1;
				a = a/2;
			}
		}

		System.out.println(num);
	}
 
}