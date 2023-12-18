import java.util.*;

public class Main{
	public static void main(String[]args){
		
		Scanner sc=new Scanner(System.in);
		
		String c1=sc.next();
		String c2=sc.next();
		String s1[]=c1.split("");
		String s2[]=c2.split("");
		boolean ans=true;
		
		for(int i=0;i<3;i++){
			
			if(s1[i].equals(s2[2-i])){
				
			}else{
				ans=false;
			}
		
		}
		
		
	if(ans==true){
		System.out.println("YES");
	}else{
		System.out.println("NO");
	}
	
	}
}