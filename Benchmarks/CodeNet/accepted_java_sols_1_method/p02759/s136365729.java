import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    System.out.println(N%2==0?N/2:N/2+1);
  }
}