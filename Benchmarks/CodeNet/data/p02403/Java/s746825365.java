import java.io.IOException;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		StringBuilder out = new StringBuilder();
		StringBuilder sum = new StringBuilder();
		
		while(true){
		int H = sc.nextInt();
		int W = sc.nextInt();
		
		if(H + W <= 0)break;
		
		for(int i = 0;i < H;i++){
			for(int j = 0;j < W;j++){
				out = out.append("#");
			}
			out = out.append("\n");
		}
		sum = sum.append(out + "\n");
		out.delete(0,out.length());
		}
		System.out.println(sum);
		sc.close();
	}

}