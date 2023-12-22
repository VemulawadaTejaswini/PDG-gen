import java.util.Scanner;
class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int numA = scanner.nextInt();
        int numB = scanner.nextInt();
        int numC = scanner.nextInt();
        int ans = 0;
        
        for (int val = numA;val <= numB;val++){
        	if(numC % val == 0) ans++;
        }	
        System.out.println(ans);	
	}	
}