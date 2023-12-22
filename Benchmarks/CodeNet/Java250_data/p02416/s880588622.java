import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		while(true) {
			String x = sc.next();
			if(x.equals("0")) {
				break;
			}
			String[] line = x.split("");
			int[] tmp = new int[line.length];
			long count = 0;
			for(int i=0;i<line.length;i++) {
				tmp[i] = Integer.parseInt(line[i]);
				count+=tmp[i];
			}
			System.out.println(count);
		}
		sc.close();
	}
}
