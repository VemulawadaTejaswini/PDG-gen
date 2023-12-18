import java.util.Scanner;
class Main{
public static void main(String args[]){
Scanner scan = new Scanner(System.in);
 for(int i=1;i<=3000; i++){
  int a = scan.nextInt();
  int b = scan.nextInt();
    if(0!=a+b){
     if(a>=b){
      System.out.println(b+" "+a);
      }else{
      System.out.println(a+" "+b);
      }
                   }else{break;      
                   }
                   }
                                        } 
           }
