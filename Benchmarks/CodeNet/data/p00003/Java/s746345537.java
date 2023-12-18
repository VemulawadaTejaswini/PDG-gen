import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int[] t=new int[N];
		for(int i=0; i<N; i++){
			t[0]=sc.nextInt();
			t[1]=sc.nextInt();
			t[2]=sc.nextInt();
			Arrays.sort(t);
			if(t[2]*t[2]==(t[0]*t[0]+t[1]*t[1])){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

}