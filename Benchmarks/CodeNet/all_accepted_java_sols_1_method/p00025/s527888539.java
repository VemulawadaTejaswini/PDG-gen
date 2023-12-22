import java.util.*;
public class Main{
	static int i,j,cntH,cntB;
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a[]=new int[4];
		int b[]=new int[4];
		while(sc.hasNextInt()){
			cntH=0;
			cntB=0;
			for( i=0;i<4;i++){a[i]=sc.nextInt();}
			for( i=0;i<4;i++){b[i]=sc.nextInt();}
			for( i=0;i<4;i++){
				if(a[i]==b[i])cntH++;			
			}
			//System.out.println(cntH);
			for(i=0;i<4;i++){
				for(j=0;j<4;j++){
					if(a[i]==b[j])cntB++;
				}
			}
		//	System.out.println(cntB);
			System.out.println(cntH+" "+(cntB-cntH));
		}
	}
}