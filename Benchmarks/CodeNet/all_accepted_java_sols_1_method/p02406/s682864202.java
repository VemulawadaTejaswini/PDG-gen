import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n =sc.nextInt();
		int co; int temp;
		
		for(co=1;co<=n;co++){
		if(co%3==0){System.out.print(" "+co);continue;}
		
		else{temp=co;
		while(temp>0){
		if(temp%10==3){System.out.print(" "+co);break;}
		temp=temp/10;
	}
}
	}
		System.out.println("");	
	}	
}