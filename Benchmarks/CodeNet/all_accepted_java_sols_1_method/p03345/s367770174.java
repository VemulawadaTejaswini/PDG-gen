import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long A=sc.nextLong(),B=sc.nextLong(),C=sc.nextLong(),K=sc.nextLong();
		if((K%2)==1){
			System.out.println((B-A));
		}else{
			System.out.println((A-B));
		}
	}
}
