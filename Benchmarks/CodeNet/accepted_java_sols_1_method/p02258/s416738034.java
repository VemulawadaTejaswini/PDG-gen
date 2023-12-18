import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int n,max;
		int minv;
		int R;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		minv=scan.nextInt();
		R=scan.nextInt();
		max=R-minv;
		if(minv>R){
			minv=R;
		}
		for(int i = 2;i<n;i++){
			R=scan.nextInt();
			if(max<R-minv){
				max=R-minv;
			}
			if(minv>R){
				minv=R;
			}
		}
		scan.close();
		
		System.out.println(max);
	}
}
