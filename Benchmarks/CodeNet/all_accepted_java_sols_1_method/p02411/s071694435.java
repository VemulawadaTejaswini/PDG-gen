import java.util.*;

/**
 * @author kawakami
 *
 */
class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner as = new Scanner(System.in);
		
		int m;
		int f;
		int r;
		
		while(true){
			
			m=as.nextInt();
			f=as.nextInt();
			r=as.nextInt();
			
			if(m == -1 && f == -1 && r == -1){
				break;
			}
			
			if(m == -1 || f == -1){
				
				System.out.println("F");
				
			}
			else if(m+f >= 80){
				
				System.out.println("A");
				
			}
			else if(m+f >= 65 && m+f < 80){
				
				System.out.println("B");
				
			}
			else if(m+f >= 50 && m+f < 65){
				
				System.out.println("C");
				
			}
			else if(m+f >= 30 && m+f < 50){
				
				if(r >= 50)
					System.out.println("C");
				
				else{
					System.out.println("D");
				}
				
			}
			else{
				System.out.println("F");
			}
			
			
			
			
		}

	}

}