import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		int c=sc.nextInt();
		int eat=0;
		for(int i=0;i<n;i++) {
			int Ai=sc.nextInt();
			for(int j=0;j<d;j++) {
				int e=j*Ai+1;
				if(e<=d) {
					eat++;
				}else {
					continue;
				}
			}
		}
		int answer=eat + c;
		System.out.println(answer);
	}
}