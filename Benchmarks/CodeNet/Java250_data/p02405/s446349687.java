import java.util.*;
public class Main{
	public static void main(String[]agrs){
		Scanner sc=new Scanner(System.in);
		int w,h;
		while(sc.hasNextInt()){
		 h=sc.nextInt();
		 w=sc.nextInt();
		 if(w==0||h==0)break;
		 for(int i=0;i<h/2;i++){
			 for(int j=0;j<w/2;j++){
				 System.out.print("#.");
				 
				 }if(w%2==1)System.out.print("#");
				 System.out.println();
			 for(int j=0;j<w/2;j++){
				 System.out.print(".#");
				 } if(w%2==1)System.out.print(".");
                  System.out.println();
			 }if(h%2==1){
				 for(int j=0;j<w/2;j++){
					 System.out.print("#.");
					 
				 }
				 if(w%2==1)System.out.print("#");
				 System.out.println();
				 
		 }System.out.println();
			
		}
	}
}