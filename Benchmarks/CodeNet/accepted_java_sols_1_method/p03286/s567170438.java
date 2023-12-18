import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    long N = Long.parseLong(scanner.next());
	    StringBuilder sb=new StringBuilder();
	    do {
	    	if (N % -2 == 0) {
	    	    sb.append("0");
	    	    N = N / -2;
	    	} else {
	    		sb.append("1");
	    		N--;
	    		N = N / -2;
	    	}
	    }while(N != 0);

        StringBuffer sbf = new StringBuffer(sb.toString());
        System.out.print(sbf.reverse().toString());
	}

}
