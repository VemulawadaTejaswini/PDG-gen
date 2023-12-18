import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int f=N/4;
		int s=0;
		int cul = 0;
		while(f>-1){
			cul = f*4+s*7;
			if(cul == N)break;
			if(cul > N) f--;
			else if(cul < N) s++;
		}
		System.out.println(cul==N?"Yes":"No");
	}
}
