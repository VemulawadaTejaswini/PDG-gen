import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		int i=1;
		while(scan.hasNext()){
			int x=scan.nextInt();
			if(x==0)
				break;
			System.out.println("Case "+i+": "+x);
			i++;
		}
	}

}