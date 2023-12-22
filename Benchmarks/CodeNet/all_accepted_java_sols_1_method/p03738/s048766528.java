import java.util.*;
 
public class Main {
 	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();

		int[] a = new int[A.length()];
		int[] b = new int[B.length()];

		if(A.length()>B.length()){
			System.out.println("GREATER");
			return;
		}else if(A.length()<B.length()){
			System.out.println("LESS");
			return;
		}else{
			for(int i=0; i<A.length(); i++){
				String a1 = String.valueOf(A.charAt(i));
				String b1 = String.valueOf(B.charAt(i));
				a[i] = Integer.parseInt(a1);
				b[i] = Integer.parseInt(b1);
				if(a[i]>b[i]){
					System.out.println("GREATER");
					return;
				}else if(a[i]<b[i]){
					System.out.println("LESS");
					return;
				}
			}
		}
		System.out.println("EQUAL");
	}
}
