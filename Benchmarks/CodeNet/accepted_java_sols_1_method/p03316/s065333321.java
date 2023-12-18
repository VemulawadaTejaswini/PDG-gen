    import java.util.Scanner;
     
    public class Main {
    	public static void main (String[] args) {
    		Scanner sc = new Scanner(System.in);
    		
    		String strN = sc.next();
    		
    		int N = Integer.parseInt(strN);
    		
    		String strNs[] = strN.split("");
    		
    		int sumN = 0;
    		
    		for (int i = 0; i < strN.length(); i++) {
    			int tmp = Integer.parseInt(strNs[i]);
    			
    			sumN += tmp;
    		}
    		
    		if (N % sumN == 0) {
    			System.out.println("Yes");
    		} else {
    			System.out.println("No");
    		}
    		
    	}
    }