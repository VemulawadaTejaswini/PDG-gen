import java.util.*;
import java.io.*;
 
public class Main{
	public static String toBin(int A) {
		String S = "";
		while(A != 0){
			int amari = A%2;
			S = S + String.valueOf(amari);
			A = A/2;
		}
		for(int i = S.length(); i < 18; i++){
			S = "0" + S;
		} 
		return S;
	}
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String[] A = new String[N];
		String xor = "000000000000000000";
		for(int i = 0; i < N; i++){
			int moto = s.nextInt();
			A[i] = toBin(moto);
			String exam = "";
			for(int j = 0; j < 18; j++){
				if(xor.charAt(j) == A[i].charAt(j)){
					exam = "0" + exam;
				}else{
					exam = "1" + exam;
				}
			}
			xor = exam;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++){
			String result = "";
			for(int j = 0; j < 18; j++){
				if(xor.charAt(j) == A[i].charAt(j)){
					result = "0" + result;
				}else{
					result = "1" + result;
				}
			}
			sb.append(Integer.parseInt(result, 2) + " ");
		}
		System.out.println(sb.toString());
	}
} 