import java.util.Scanner;
//import java.lang.Math;

class Main{
	public static void main(String[] arg){
	
		
		Scanner sc = new Scanner(System.in);
		int[] str = new int[7];
		
		for(int i=1;i<7;i++){
		     
			str[i]=sc.nextInt();
		}
		
		char[] a=sc.next().toCharArray();
		for(int i=0;i<a.length;i++){
			if(a[i]=='N'){
				str[0]=str[1];
				str[1]=str[2];
				str[2]=str[6];
				str[6]=str[5];
				str[5]=str[0];
				
			}else if(a[i]=='S'){
				
				str[0]=str[1];
				str[1]=str[5];
				str[5]=str[6];
				str[6]=str[2];
				str[2]=str[0];
				
				
			}else if(a[i]=='E'){
				
				str[0]=str[1];
				str[1]=str[4];
				str[4]=str[6];
				str[6]=str[3];
				str[3]=str[0];
			}else {
				str[0]=str[1];
				str[1]=str[3];
				str[3]=str[6];
				str[6]=str[4];
				str[4]=str[0];
			}
		}
		sc.close();
	System.out.println(str[1]);
		
		}
}
		
