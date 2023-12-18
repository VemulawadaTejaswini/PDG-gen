import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int K=s.nextInt();
    int A=s.nextInt();
    int B=s.nextInt();

    System.out.println(K*(A/K)+K<=B||A%K==0?"OK":"NG");
  }  
}