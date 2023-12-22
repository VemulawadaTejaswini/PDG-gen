import java.util.Scanner;
 
class Main {
 
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		char L = 'a';
		char A[] = new char[26];
		int i;
	
		String B = stdIn.next();

		for(i=0;i<=(25);i++){
			A[i]=L++;
		}
		
		for(i=0;i<=(25);i++){
			if(B.charAt(0) == A[i]){
				System.out.println(A[++i]);
				break;
			}
		}

	}
    
}