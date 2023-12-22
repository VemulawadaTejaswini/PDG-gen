import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long B = sc.nextLong();
    long K = sc.nextLong();
    
    if(A>=K){
      A -= K;
    }else{
      long J = K-A;
      A=0;
      
      if(B>=J){
        B -= J;
      }else{
        B = 0;
      }
    }
    System.out.println(A+" "+B);
  }
}  