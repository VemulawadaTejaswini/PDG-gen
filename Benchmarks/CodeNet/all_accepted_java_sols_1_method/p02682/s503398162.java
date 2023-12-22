import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=sc.nextInt();
    int K=sc.nextInt();
    int ans=0;
    while(true){
      if(K==0){
        break;
      }
     while(A>0){
       K--;
       A--;
       ans++;
       if(K==0){
         break;
       }
     }
     if(K==0){
       break;
     }
     while(B>0){
       K--;
       B--;
       if(K==0){
         break;
       }
     }
     if(K==0){
       break;
     }
     while(C>0){
       C--;
       K--;
       ans--;
       if(K==0){
         break;
       }
     }

    }


      System.out.println(ans);




  }
}
