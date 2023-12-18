import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String St = sc.nextLine();
		String num = sc.nextLine();
		String U = sc.nextLine();
		
		String[] str1 = St.split(" ");
		String[] str2 = num.split(" ");
		
		String S = str1[0];
		String T = str1[1];
		
		int A = Integer.parseInt(str2[0]);
		int B = Integer.parseInt(str2[1]);
				
		if(U.equals(S)){
			A = A - 1;
		}
		else if(U.equals(T)){
			B = B - 1;
		}
		
		System.out.println(A+" "+B);
	}
}