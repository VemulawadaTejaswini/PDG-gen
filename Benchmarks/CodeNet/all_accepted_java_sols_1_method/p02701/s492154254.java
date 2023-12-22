import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner scanner = new Scanner(System.in);
	    //String input1 = scanner.next();
	    String input2 = scanner.next();

	    //int h=Integer.parseInt(input1);
	    int n=Integer.parseInt(input2);
	    //int a[]=new int[n];
	    Set<String> sa=new HashSet<String>();
	    for(int i=0;i<n;i++) {
	    	sa.add(scanner.next());
	    }
	    scanner.close();
	    /*int sum=sa.stream()
	    		.mapToInt(s->Integer.parseInt(s))
	    		.sum();
	    	System.out.println("YES");*/
	    System.out.println(sa.size());
	}

}
