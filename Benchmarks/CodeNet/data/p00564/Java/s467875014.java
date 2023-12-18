import java.io.IOException;
import java.util.Scanner;
public class test {
	public static void main(String[] args)throws IOException{
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		int D = scanner.nextInt();
		int x,y;
		x = N%A;
		y = N%C;
		if(x != 0){
			x = (N/A+1) * B;
		}else{
			x = (N/A) * B;
		}
		if(y != 0){
		 y = (N/C + 1) * D;
		}else{
			y = (N/C) * D;
		}
		if(x <= y){
		System.out.print(x);
		}else{
			System.out.print(y);
		}
	}
		

}

