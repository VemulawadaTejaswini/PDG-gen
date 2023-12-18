import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ans=700;
		String b;
		String a;
		a=sc.next();

		for(int i=0;i<3;i++){
			if(a.charAt(i)=='o') ans=ans+100;
		}

		System.out.println(ans);
	}
}