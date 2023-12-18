import java.util.*;
class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt()+1;
    int k=sc.nextInt();
    int m=k;
    int po=1;
    while(m<n){
      m*=k;
      po++;
    }
    System.out.print(po);
  }
}
