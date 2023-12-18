



import java.util.*;

public class Main {
	
	public static void main(String args[]){
		
		
		Scanner sc= new Scanner(System.in);
		String ln= sc.next();
		
		int ans = 753;
		
		for(int i=0;i<ln.length()-2;i++){
			int x1=ln.charAt(i)-'0';
			int x2=ln.charAt(i+1)-'0';
			int x3=ln.charAt(i+2)-'0';
			
			int num = x1*100+x2*10+x3;
			//System.out.println(num);
			if(ans>Math.abs(num-753))ans=Math.abs(num-753);
		}
		
		
		System.out.println(ans);
	}

}

