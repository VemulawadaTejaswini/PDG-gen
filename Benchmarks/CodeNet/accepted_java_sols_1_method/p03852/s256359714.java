    import java.util.Scanner;

    public class Main {
    	public static void main(String[] args) {
    		Scanner sc = new Scanner(System.in);
    		String a = sc.next();
    		if(a.equals("a") || a.equals("i") || a.equals("u") || a.equals("e") || a.equals("o")) {
    			System.out.println("vowel");
    			System.exit(0);
    		}
    		else {
    			System.out.println("consonant");
    			System.exit(0);
    		}
    	}
    }