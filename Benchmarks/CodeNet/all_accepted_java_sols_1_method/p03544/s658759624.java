import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			long[] lucas =new long[87] ;
			lucas[0]=2;lucas[1]=1;
			for(int i=2;i<=86;i++) 
				lucas[i]=lucas[i-2] + lucas[i-1];
			System.out.println(lucas[N]);
	}

}
