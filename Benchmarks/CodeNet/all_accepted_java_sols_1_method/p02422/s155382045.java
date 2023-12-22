import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder(sc.next());
        int count = sc.nextInt();

        for(int i = 0; i < count; i++) {
        	String order = sc.next();
        	int a = sc.nextInt();
    		int b = sc.nextInt();

        	switch(order) {
        	case "print":
        		 System.out.println(sb.substring(a, b+1));;
        		break;
        	case "reverse":
        		String rev = new StringBuilder(sb.substring(a, b+1)).reverse().toString();
        		sb.replace(a, b+1, rev);
        		break;
        	case "replace":
        		String rep = sc.next();
        		sb.replace(a, b+1, rep);
        		break;
        	}
        }
    }
}
