import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		        Scanner sc = new Scanner(System.in);
		        long n = sc.nextLong();
		        long k = sc.nextLong();
		        long i = n%k;
		        //余り
		        if (i<=k-i){
		            System.out.println(i);
		        }else{
		            System.out.println(k-i);
		        }
	}
}
