package Hello_world;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String temp = scanner.next();

		String[] a=temp.split("");
		//Arrays.stream(a).forEach(e -> System.out.println(e));
		int H = Integer.parseInt(a[0]);
		int W= Integer.parseInt(a[1]);

		while((300 >= W  && 1 <= W )&&(300>= H  &&1 <= H )){
		for(int i=0;i<H;i++){
			for(int j=0;j<W;j++){
				if((i==0 || i==H-1)||(j==0 || j==W-1)){
			  System.out.print("#");
				}else{
					System.out.print("."); }
				}
				System.out.println("");
		}
		System.out.println("");
		temp = scanner.next();
		
		String[] a1=temp.split("");
		W = Integer.parseInt(a1[0]);
		H = Integer.parseInt(a1[1]);
		}
	}	
}		