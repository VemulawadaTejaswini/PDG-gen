import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    String s=sc.next();
    char c=s.charAt(sc.nextInt()-1);
    for(int i=0;i<n;i++){
      System.out.print(c==s.charAt(i)?c:'*');
    }
    System.out.println();
  }
}