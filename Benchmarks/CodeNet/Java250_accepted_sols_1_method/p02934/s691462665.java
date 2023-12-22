import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    double s[]=new double[N];
    double total=0;
    for(int i=0;i<N;i++){
      s[i]=sc.nextDouble();
      total=total+1/s[i];
    }
    System.out.println(1/total);
   }
}