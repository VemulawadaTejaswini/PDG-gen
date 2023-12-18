import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn=new Scanner(System.in);
		int q=stdIn.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<q;i++) {
			int a=stdIn.nextInt();
			if(a!=2) {
				int b=stdIn.nextInt();
				if(a==1) 
					System.out.println(list.get(b));
				else
					list.add(b);
			}
			else
				list.remove(list.size()-1);
		}
	}
}

