import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	public void exec() throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter out = new PrintWriter(System.out);
		
		for(int i=1; true; i++){
			int x = input.nextInt();
			if(x == 0){
				break;
			}else{
				out.println(new StringBuilder("Case ").append(i).append(": ").append(x));
			}
		}
		out.flush();
		input.close();
	}

	public static void main(String[] args) throws IOException {
		new Main().exec();
	}
}