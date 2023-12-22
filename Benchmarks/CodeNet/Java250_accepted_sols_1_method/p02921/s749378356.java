import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		String b=sc.next();
		int n=0;
		for(int i=0;i<3;i++){
			if(a.charAt(i)==b.charAt(i)){
				n=n+1;
			}
		}
		System.out.print(n);
		
	}
}
