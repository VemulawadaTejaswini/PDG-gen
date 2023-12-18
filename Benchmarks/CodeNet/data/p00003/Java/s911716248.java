import java.util.*;
import java.io.*;
public class Main {
	static Scanner sc = new Scanner(System.in);
	static InputStreamReader reader = new InputStreamReader(System.in);
	static int n, a, b, c;//prepare "number" and "Edge".
	static int A,B,C;
	public static void main(String[] args) {
	 
	 read();
	 
	}

	static boolean read(){
		try{
			n = reader.read();//read "number".
			int i;
			for(i = 0; i <= n; i++){
				a = reader.read();//read "edge".
				b = reader.read();//read "edge".
				c = reader.read();//read "edge".
				
				if(a != 0 && b != 0 && c!= 0){
					A = a * a;//calculate the power of edge of A.
					B = b * b;//calculate the power of edge of B.
					C = c * c;//calculate the power of edge of C.
						if(A == B + C){//compare
							System.out.println("YES");//output
							return true;//success
						}
						if(B == A + C){//compare
							System.out.println("YES");//output
							return true;//success
						}
						if(C == A + B){//compare
							System.out.println("YES");//output
							return true;//success
						}
						System.out.println("NO");
						return true;//failed
				}
			}
			System.out.println("NO");
		}catch(Exception e){
			System.out.println("Sorry.");
			e.getStackTrace();
		}		
		
		return true;
	}
}
	
	
	