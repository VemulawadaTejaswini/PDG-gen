import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		char[] s=sc.next().toCharArray();
		
		int count1=0,count0=0;
		for(char c:s){
			if(c=='1')
				count1++;
			else
				count0++;
		}
		
		System.out.println(Math.min(count0,count1)*2);
	
	}
	
}