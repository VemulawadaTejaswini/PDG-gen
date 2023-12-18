import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt(); //現在地
		int k=sc.nextInt(); //動く回数
		int d=sc.nextInt(); //移動距離
		
		for(int i=0;i<k;i++) {
			int a=Math.abs(x+d);
			int b=Math.abs(x-d);
			
			if(a<b) {
				x=x+d;
			}else {				
				x=x-d;
			}
			
		}
		
		System.out.println(Math.abs(x));
	}

}
