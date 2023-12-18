import java.lang.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++){
			String s=sc.next();
			if(s.matches("^>'(=+)#\\1~$"))
				System.out.println("A");
			else if(s.matches("^>\\^(Q=)+~~$"))
				System.out.println("B");
			else
				System.out.println("NA");
		}
	}
}