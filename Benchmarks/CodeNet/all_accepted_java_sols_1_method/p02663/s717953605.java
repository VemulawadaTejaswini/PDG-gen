import java.util.*;
public class Main{
  public static void main(String[] args){
  	Scanner sc=new Scanner(System.in);
    int H1=sc.nextInt();
    int M1=sc.nextInt();
    int H2=sc.nextInt();
    int M2=sc.nextInt();
    int K=sc.nextInt();
    
    int awakeTime=60*H2+M2-60*H1-M1;
    int startLength=awakeTime-K;
    System.out.println(startLength);
  }
}