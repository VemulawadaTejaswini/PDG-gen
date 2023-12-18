import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n,x;
		Scanner scan = new Scanner(System.in);
		while(true){
			n=scan.nextInt();
			x=scan.nextInt();
			int ways=0;
			if((n==0)&&(x==0))
				break;
			for(int i=3;i<=n;i++){
				for(int j=2;j<i;j++){
					for(int k=1;k<j;k++){
						if((i+j+k)==x)
							ways++;
					}
				}
			}
			System.out.println(ways);
		}
	}
}
