import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
			int a =sc.nextInt();
			int[] c =new int[a];
			int s=1000;
			int d =0;
			int du =0;
			for(int i =0 ;i<a;i++){
				c[i]= sc.nextInt();

			}
			
		   d=s/c[0];
			s=s%c[0];
			//System.out.println(1+":"+s+" "+d);
			int j=0;
			for(int i =1 ;i<a;i++){
				if(c[i]<c[i-1]&&d==0) {
					d=s/c[i];
					 s =s%c[i];
					j=i;
				}
				if(c[i]>c[i-1]&&d!=0) {
					s+=d*c[i];
					d=0;
					
				}
				
				//System.out.println(i+1+":"+s+" "+d);
				
			}
			System.out.println(s+d*c[j]);
		}





	

}



