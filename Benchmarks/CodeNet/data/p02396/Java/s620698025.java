import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean roopFlag=false;
		List<Integer>test=new ArrayList<Integer>();
		while(!roopFlag) {
			int x=sc.nextInt();
			if(x!=0) {
				test.add(x);
			}else {
				roopFlag=true;
			}

		}
		for (int i = 0; i < test.size(); i++) {
			System.out.println("Case "+(i+1)+": "+test.get(i));
		}

	}

}

