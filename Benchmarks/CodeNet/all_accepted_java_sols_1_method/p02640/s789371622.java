import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int X =sc.nextInt();int Y =sc.nextInt();
    if(Y%2==1){System.out.println("No");}
    else{ int y =Y/2;
         if(y-X<0){System.out.println("No");}
         else if(y-2*X>0){System.out.println("No");}
         else{System.out.println("Yes");}
        }
  }
}