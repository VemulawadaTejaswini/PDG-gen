import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
     String s = sc.next();
     sc.close();
     String []ss = s.split("");
     
     int a = Integer.parseInt(ss[0]);
     int b = Integer.parseInt(ss[1]);
     int c = Integer.parseInt(ss[2]);
     int d = Integer.parseInt(ss[3]);
     String op1 ="";
     String op2 ="";
     String op3 ="";
      
     if(a+b+c+d ==7) {
    	op1 ="+"; op2 ="+"; op3 ="+";
     }
     else if(a+b-c+d ==7) {
      	op1 ="+"; op2 ="-"; op3 ="+";
       }
     else if(a+b-c-d ==7) {
       	op1 ="+"; op2 ="-"; op3 ="-";
        }
     else if(a+b+c-d ==7) {
        	op1 ="+"; op2 ="+"; op3 ="-";
         }
     else if(a-b+c+d ==7) {
     	op1 ="-"; op2 ="+"; op3 ="+";
      }
     else if(a-b+c-d ==7) {
      	op1 ="-"; op2 ="+"; op3 ="-";
       }
     
     else if(a-b-c+d ==7) {
      	op1 ="-"; op2 ="-"; op3 ="+";
       }
     
    System.out.println((a+op1+b+op2+c+op3+d+"=7"));  
	}
}
