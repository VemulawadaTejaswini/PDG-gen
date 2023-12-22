import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
	
		int l=s/100;
		int r=s%100;
		String ans="NA";


		if(0<l&&l<13&&0<r&&r<13)ans="AMBIGUOUS";
		if(0<l&&l<13&&(r<1||12<r))ans="MMYY";
		if((l<1||12<l)&&0<r&&r<13)ans="YYMM";
		
		System.out.println(ans);
	}
}