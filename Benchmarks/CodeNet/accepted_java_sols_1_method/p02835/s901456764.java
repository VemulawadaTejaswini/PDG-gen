import java.util.*;
class Main{
  public static void main(String[] s){
    Scanner sc = new Scanner(System.in);
    int a =sc.nextInt()+sc.nextInt()+sc.nextInt();
    if(a>21){System.out.println("bust");}
    else{System.out.println("win");}}}