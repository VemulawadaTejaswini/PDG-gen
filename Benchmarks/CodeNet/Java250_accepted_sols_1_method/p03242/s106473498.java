import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    for(int i=0;i<3;i++){
      System.out.print(s.charAt(i)=='1'?9:1);
    }
    System.out.println();
  }
}
