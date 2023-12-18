import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		int k = sc.nextInt();
		if(n-n/2>=k){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}