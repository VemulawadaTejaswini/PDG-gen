import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    InputStreamReader is = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(is);
    int num,i;
    int []S = new int[13];
    int []H = new int[13];
    int []C = new int[13];
    int []D = new int[13];

    for(i = 0;i < 13;i++){
      S[i] = 0;
      H[i] = 0;
      C[i] = 0;
      D[i] = 0;
    }
    num = sc.nextInt();
    for(i = 0;i < num;i++){
      char op = sc.next().charAt(0);
      int c = sc.nextInt();
      if(op == 'S'){
        S[c - 1] = 1;
      }
      else if(op == 'H'){
        H[c - 1] = 1;
      }
      else if(op == 'C'){
        C[c - 1] = 1;
      }
      else if(op == 'D'){
        D[c - 1] = 1;
      }
    }

    for(i = 0;i < 13;i++){
      if(S[i] == 0){
         System.out.println("S "+ (i + 1));
      }
    }
    for(i = 0;i < 13;i++){
      if(H[i] == 0){
         System.out.println("H "+ (i + 1));
      }
    }
    for(i = 0;i < 13;i++){
      if(C[i] == 0){
         System.out.println("C "+ (i + 1));
      }
    }
    for(i = 0;i < 13;i++){
      if(D[i] == 0){
         System.out.println("D "+ (i + 1));
      }
    }
  }
}