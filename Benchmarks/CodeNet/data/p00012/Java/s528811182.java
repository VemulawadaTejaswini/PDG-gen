import java.util.*;
public class main {
	private static Scanner sc=new Scanner(System.in);
	static int x1,x2,x3,y1,y2,y3,xp,yp;
	public static void main(String[] args) {
		while(sc.hasNextInt()){
			int xm[ ]=new int[3];
			int ym[]=new int[3];
		 for (int i = 0; i < 3; i++) {
			 xm[i]=sc.nextInt();
			 ym[i]=sc.nextInt();
		  }
		 xp=sc.nextInt();yp=sc.nextInt();
		 Arrays.sort(xm);
		 Arrays.sort(ym);
		 if(xm[0]<xp){
			 if(xm[3]>xp){
				 if(ym[0]<yp){
					 if(ym[3]<yp){
						 System.out.println("Yes");
					 }else{mm();}
				 }else{mm();}
			 }else{mm();}
		 }else{mm();}
		 
		 
		 
		}
		
	
	}
	private static void  mm(){
		System.out.println("No");
		
	}

}