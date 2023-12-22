import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int flag=0;
		int ini=0;
		int fin=0;

		for(int i=0;i<a.length();i++){
			if(a.charAt(i)=='A' && flag==0){
				flag=1;
				ini=i;
			}else if(a.charAt(i)=='Z' && flag==1){
				fin=i;
			}
		}

		System.out.println(fin-ini+1);
	}
}