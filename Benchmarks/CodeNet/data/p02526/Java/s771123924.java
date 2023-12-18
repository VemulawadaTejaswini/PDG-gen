import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		TreeSet s = new TreeSet();
		
		for(int i=0;i<n;i++)
			s.add(stdIn.nextInt());

		int q = stdIn.nextInt();
		int cnt = 0;
		
		for(int i=0;i<q;i++){
			if(s.contains(stdIn.nextInt()))
				cnt++;
		}
		System.out.println(cnt);
	}
}