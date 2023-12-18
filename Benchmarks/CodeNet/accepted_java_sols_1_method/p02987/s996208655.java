import java.util.Scanner;
public class Main{
	public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
      String S=sc.next();
      char m0=S.charAt(0);
      char m1=S.charAt(1);
      char m2=S.charAt(2);
      char m3=S.charAt(3);
      if(m0==m1){
      	if(m2==m3){
        	if(m0==m2){
            	System.out.println("No");
            }else{
            	System.out.println("Yes");
            }
        }
        else{
        	System.out.println("No");
        }
      }else if(m0==m2){
      	if(m1==m3){
        	if(m0==m1){
            	System.out.println("No");
            }else{
            	System.out.println("Yes");
            }
        }
        else{
        	System.out.println("No");
        }
      }else if(m0==m3){
      	if(m1==m2){
        	if(m0==m1){
            	System.out.println("No");
            }else{
            	System.out.println("Yes");
            }
        }
        else{
        	System.out.println("No");
        }
      }else{
      	System.out.println("No");
      }
    }
}