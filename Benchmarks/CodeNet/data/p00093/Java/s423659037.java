import java.io.PrintWriter;
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		while(sc.hasNext()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			boolean judge = false;
			if( (a == 0 && b == 0) || a > b) break;
			for(int i = a; i <= b; i++){
				if((i % 4 == 0 && i % 100 != 0) || i % 400 == 0){
					out.println(i);
					judge = true;
				}
			}
			if(!judge) out.println("NA");
			out.println();
			out.flush();
		}
	}
}