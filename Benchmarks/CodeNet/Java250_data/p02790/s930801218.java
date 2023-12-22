import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc =  new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String str1="";
		if(a<b){
			for(int i = 0;i<b;i++)
			str1+=""+a;
		}else{
			for(int i = 0;i<a;i++)
			str1 += ""+b;
		}
		System.out.println(str1);
		
	}
	
}