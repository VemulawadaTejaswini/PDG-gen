import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		while(true){
			int n = cin.nextInt();
			int p = cin.nextInt();
			if(n+p==0){
				break;
			}
			int wan = p;
			int[] a = new int[n];
			int now=0;
			while(true){
				if(p!=0){
					a[now]++;
					p--;
					if(a[now]==wan){
						System.out.println(now);
						break;
					}
				}
				else{
					p = a[now];
					a[now]=0;
				}
				now=(now+1)%n;
			}
		}
	}

}