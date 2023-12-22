    import java.util.Scanner;
     
    public class Main {
    	public static void main(String[] args) {
    		Scanner scanner = new Scanner(System.in);
    		int n = scanner.nextInt();
    		int a = scanner.nextInt();
    		int b = scanner.nextInt();
    		int ta = 0, tb = 0;
    		String string = scanner.next();
    		for (int i = 0; i < n; i++) {
    			switch (string.charAt(i)) {
    			case 'a':
    				if (ta + tb < a + b) {
    					ta++;
    					System.out.println("Yes");
    					break;
    				}
    				System.out.println("No");
    				break;
     
    			case 'b':
    				if (ta + tb < a + b && tb < b) {
    					tb++;
    					System.out.println("Yes");
    					break;
    				}
    				System.out.println("No");
    				break;
     
    			case 'c':
    				System.out.println("No");
    				break;
    			}
    		}
    	}
    }