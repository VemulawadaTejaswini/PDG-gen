import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    sc.nextInt();
    System.out.println((sc.nextInt()*10+sc.nextInt())%4==0?"YES":"NO");
  }
}
