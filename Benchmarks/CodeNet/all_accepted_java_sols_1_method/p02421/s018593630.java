import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int taro = 0, hanako = 0;
    	for(int i = 0; i < n; i++) {
    		String aml1 = sc.next(), aml2 = sc.next();
    		if(aml1.compareTo(aml2) > 0) {
    			taro+=3;
    		} else if(aml1.compareTo(aml2) < 0) {
    			hanako+=3;
    		} else {
    			taro++;
    			hanako++;
    		}
    	}
    	System.out.println(taro + " " + hanako);
    }
}