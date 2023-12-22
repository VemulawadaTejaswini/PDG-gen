import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int N =sc.nextInt();
    int n =N/1000;
    if(N%1000==0){System.out.println(0);}
    else{System.out.println((n+1)*1000-N);}
  }
}