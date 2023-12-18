import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			else if(n==1){
				System.out.println("1 1");
				continue;
			}
			
			int a[][] = new int[n][2];
			a[0][0] = 0;
			a[0][1] = 0;
			int minx=0, miny=0, maxx=0, maxy=0;
			for(int i=1;i<n;i++){
				int m = stdIn.nextInt();
				int d = stdIn.nextInt();
				a[i][0] = a[m][0];
				a[i][1] = a[m][1];
				if(d==0){
					a[i][0]--;
					if(a[i][0]<minx){
						minx = a[i][0];
					}
				}
				else if(d==1){
					a[i][1]--;
					if(a[i][1]<miny){
						miny = a[i][1];
					}
				}
				else if(d==2){
					a[i][0]++;
					if(a[i][0]>maxx){
						maxx = a[i][0];
					}
				}
				else if(d==3){
					a[i][1]++;
					if(a[i][1]>maxy){
						maxy = a[i][1];
					}
				}
			}
			System.out.println((maxx-minx+1)+" "+(maxy-miny+1));
		}
	}
}