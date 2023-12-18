import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int m1=sc.nextInt()*60+sc.nextInt();
    int m2=sc.nextInt()*60+sc.nextInt();
    System.out.println((m2-m1-sc.nextInt()));
  }
}