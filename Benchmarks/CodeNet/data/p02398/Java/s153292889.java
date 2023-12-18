import java.util.Scanner;
public class Main {
 public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int x,y,z,i=0,a;
     x=sc.nextInt();
     y=sc.nextInt();
     z=sc.nextInt();
     for(a=x;a<=y;a++){
    	 if(z%a==0)
    		 i=i+1;
     }
     
     System.out.println(i);
    sc.close();
 }
     
     
}
