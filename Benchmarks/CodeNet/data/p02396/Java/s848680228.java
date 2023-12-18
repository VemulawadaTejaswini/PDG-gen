import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> array = new ArrayList<Integer>();

		for(int i=0;i<10000;i++) {
			int tmp = sc.nextInt();
			if(tmp==0) {
				break;
			}
			array.add(tmp);
		}

		for(int i=0;i<array.size();i++) {
			System.out.println("Case " + (i+1) + ": " + array.get(i));
		}

		sc.close();
	}
}
