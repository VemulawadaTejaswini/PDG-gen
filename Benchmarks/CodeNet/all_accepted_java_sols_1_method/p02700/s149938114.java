
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        
        while(true) {
        	A = A-D;
        	C = C-B;
        	
        	if(A <= 0 && C <= 0) {
        		System.out.print("Yes");
        		break;
        	}else if(C<=0) {
        		System.out.print("Yes");
        		break;
        	}else if(A<=0) {
        		System.out.print("No");
        		break;
        	}
        	
        	
        	
        }

        

        
        }
	}

