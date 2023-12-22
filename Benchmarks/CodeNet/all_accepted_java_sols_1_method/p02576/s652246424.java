import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int t=sc.nextInt();
    int sum=(n/x)*t;
    if(n%x!=0)sum+=t;
    System.out.println(sum);
  }
}