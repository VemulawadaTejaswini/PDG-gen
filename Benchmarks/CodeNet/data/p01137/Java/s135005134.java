import java.io.PrintWriter;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter pr = new PrintWriter(System.out);
		while(true){
			int e = sc.nextInt();
			if(e==0) break;
			int z = 0;
			int y = 0;
			int x = e - y*y - z*z*z;
			int min = x + y + z;
			while(z*z*z<=e){
				while(y*y<=e-z*z*z){
					x = e - y*y - z*z*z;
					int tmp = x + y + z;
					if(tmp<min){
						min = tmp;
					}
					y++;
				}
				y = 0;
				z++;
			}
			pr.println(min);
		}
		pr.flush();
		sc.close();
	}
}