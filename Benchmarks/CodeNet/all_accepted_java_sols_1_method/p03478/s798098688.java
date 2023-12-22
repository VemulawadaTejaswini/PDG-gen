import java.util.*;

public class Main{
	public static void main(String[] args){
	
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int a=sc.nextInt();
	int b=sc.nextInt();
	long total=0;
	for(int i=1;i<=n;i++){
		String s[]=String.valueOf(i).split("");
		int m=0;
		for(int k=0;k<s.length;k++){
			m+=Integer.parseInt(s[k]);
		}
		if(m>=a && m<=b) total+=i;
	}
	System.out.println(total);


	}
}



