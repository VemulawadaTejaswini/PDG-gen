import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K=sc.nextInt();
    int A=sc.nextInt();
    int B=sc.nextInt();
    int N=1;
    boolean judge=false;
    boolean judge1=true;
    while(judge1==true){
      if(K*N>=A&K*N<=B){
          judge=true;
          break;
      }
      if(K*N-B>0){
        judge=false;
        break;
      }
       N++;
    }
    if(judge==true){
      System.out.println("OK");
    }else{
      System.out.println("NG");
    }




  }
}
