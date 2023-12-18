import java.util.Scanner;
public class Main{
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt(), ans=0;
			for(int i=1;i<600/n;i++){
				ans+=Math.pow(i*n, 2)*n;
			}
			System.out.println(ans);
		}
	}
}