import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.HashSet;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int K=sc.nextInt();
    String S=sc.next();
    String Ss[]=S.split("");
    if(Ss.length<=K){
      System.out.println(S);
    }else{
      for(int i=0;i<K;i++){
        System.out.print(Ss[i]);

      }
       System.out.print("...");
    }




  }
}
