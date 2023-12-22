import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
	    String input1 = scanner.next();
	    String input2 = scanner.next();

	    int h=Integer.parseInt(input1);
	    int n=Integer.parseInt(input2);
	    int a[]=new int[n];
	    List<String> sa=new ArrayList<String>();
	    for(int i=0;i<n;i++) {
	    	sa.add(scanner.next());
	    }
	    scanner.close();
	    int sum=sa.stream()
	    		.mapToInt(s->Integer.parseInt(s))
	    		.sum();
	    if(sum<h)
	    	System.out.println("No");
	    else
	    	System.out.println("Yes");
	}

}