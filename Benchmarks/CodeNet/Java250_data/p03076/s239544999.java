import java.util.*;
 
public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] n = new int[5];
		int prt=0;
		for(int i=0;i<5;i++){
			n[i]=sc.nextInt();
		}
		int mai=0;
		for(int i=1;i<5;i++){
			if(n[i]%10!=0){
				if(n[mai]%10==0)mai=i;
				if(10-n[i]%10>10-n[mai]%10)mai=i;
			}
		}
		for(int i=0;i<5;i++){
			if(i!=mai)prt+=n[i]%10==0?n[i]:n[i]-n[i]%10+10;
		}
		prt+=n[mai];
		System.out.print(prt);
	}
}