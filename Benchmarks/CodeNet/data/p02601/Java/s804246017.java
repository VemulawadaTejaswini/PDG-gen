import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main {
	public static String toFour(int x){
		String S = Integer.toString(x, 4);
		for(int i = S.length(); i <= 7; i++){
			S = "0" + S;
		}
		return S;
	}
	
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int A = s.nextInt();
	int B = s.nextInt();
	int C = s.nextInt();
	int K = s.nextInt();
	boolean suc = false;
	for(int i = 0; i < Math.pow(4, K); i++){
		int a = A;
		int b = B;
		int c = C;
		for(int j = 0; j < toFour(i).length(); j++){
			if(toFour(i).charAt(j) == '1'){
				a = 2*a;
			}else if(toFour(i).charAt(j) == '2'){
				b = 2*b;
			}else if(toFour(i).charAt(j) == '3'){
				c = 2*c;
			}else{

			}
			if(b > a && c > b){
				suc = true;
				break;
			}
		}
		if(suc) break;
	}
	if(suc){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
    
  }
}