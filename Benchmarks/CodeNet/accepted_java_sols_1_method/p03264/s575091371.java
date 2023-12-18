import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int k = scanner.nextInt();
        int kk = k/2;
		if(k%2==0){
			System.out.print(kk * kk);
			System.exit(0);
		}
		System.out.print(kk + kk * kk);
	}
}