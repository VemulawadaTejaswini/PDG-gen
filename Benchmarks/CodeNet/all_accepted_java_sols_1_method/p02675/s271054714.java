import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    if(N%10==3){System.out.println("bon");}
    else if(((N%10==1)||(N%10==0))||((N%10==6)||(N%10==8))){System.out.println("pon");}
    else{System.out.println("hon");}
  }
}