import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int r=0;
		int ans=0;
		for(int i=n-1; i>=0; i--){
			if(s.charAt(i)=='W'){
				int w=1;
				if(r>0){
					while(i>=0){
						if(s.charAt(i)=='W'){
							w++;
						}else{
							break;
						}
						i--;
					}
				}
				i++;
				ans=Math.min(r,w);
				r=0;
			}else{
				r++;
			}
		}
		System.out.println(ans);
	}
}
