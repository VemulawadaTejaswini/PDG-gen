import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int X = sc.nextInt();
		
		for(int i=0;i<(K*2)-1;i++) {
			int y=(X+1)-K+i;
			if(y<-1000000 || y>1000000) {
				break;
			}
			System.out.print(y+" ");
		}
		
	}
}
