import java.util.*;
import java.io.*;
public class Main {
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		BufferedReader bin = new BufferedReader(new InputStreamReader(System.in));
		try {
			int num = stdIn.nextInt();
			for(int k = 0; k < num; k++) {
				String str = bin.readLine();
				String[] ary = str.split(" ");
				for(int r = 0; r < ary.length; r++)
					if(ary[r].equals("Hoshino")) ary[r] = "Hoshina";
				for(int r = 0; r < ary.length; r++)
					System.out.print(ary[r] + ((r == ary.length - 1) ? "" : " "));
				System.out.println();
			}
		}catch(IOException e){}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}

}