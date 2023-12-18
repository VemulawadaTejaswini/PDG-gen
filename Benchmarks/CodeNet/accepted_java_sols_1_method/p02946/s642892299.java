import java.util.*;

public class Main {
public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int k=sc.nextInt();
		int x=sc.nextInt();
		int s=x-k+1;
		int s2=x+k-1;
		for(int i=s;i<=s2;i++){
			System.out.println(i);
		}


	}
}

