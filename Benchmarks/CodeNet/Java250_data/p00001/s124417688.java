import java.util.Scanner;

public class Main {
	public static void main(String[] a){
		
		Scanner sc = new Scanner(System.in);
		int mx1 = 0, mx2 = 0, mx3 = 0;
		
		for(int i = 0; i < 10; i ++){
			int mtHeight = sc.nextInt();
			if(mx1 < mtHeight){
				mx3 = mx2;
				mx2 = mx1;
				mx1 = mtHeight;
			}else if(mx2 < mtHeight){
				mx3 = mx2;
				mx2 = mtHeight;
			}else if(mx3 < mtHeight){
				mx3 = mtHeight;
			}
			
			}
		System.out.printf("%d\n%d\n%d\n", mx1, mx2, mx3);
	}
}
	