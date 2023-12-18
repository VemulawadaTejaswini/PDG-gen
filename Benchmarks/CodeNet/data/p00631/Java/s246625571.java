import java.util.Scanner;
								
public class Main{
			public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			while(sc.hasNext()) {
				int n= sc.nextInt();
				if(n==0)break;
				
				int[] power = new int[n+1];
				for(int i=0;i<n;i++) {
					power[i] = sc.nextInt();
				}
				
				int min = 1000000;
				for(int i=0;i<(1<<n);i++) {
					int a = 0;
					int b = 0;
					int s = 0;
					for(int j=0;j<n;j++) {
						if((i>>j)%2==0) a += power[s];
						else b += power[s];
						s++;
					}
					int ret = Math.abs(a-b);
					min = Math.min(ret, min);
				}
				
				System.out.println(min);
			}
	}
}

