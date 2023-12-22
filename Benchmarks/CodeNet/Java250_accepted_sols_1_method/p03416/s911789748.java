
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int a = scan.nextInt();
	    int b = scan.nextInt();
	    scan.close();
	    int cnt=0;
	    for(int i=a;i<=b;i++) {
	    	String s = String.valueOf(i) ;
	    	for(int j=0;j<s.length()/2;j++) {
	    		int x = Character.getNumericValue(s.charAt(j));
	    		int y = Character.getNumericValue(s.charAt(s.length()-1-j));
	    		if(x!=y)break;
	    		else if(j==s.length()/2-1)cnt++;

	    	}
	    }
	    System.out.println(cnt);
	}

}