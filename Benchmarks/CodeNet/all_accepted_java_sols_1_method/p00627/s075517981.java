import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true){
			int n=in.nextInt();
			if(n==0)break;
			int kai=n/4;
			int sum=0;
			for(int i=0;i<kai;i++){
				sum+=in.nextInt();
			}
			System.out.println(sum);
		}
	}
}