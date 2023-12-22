import java.util.Scanner;

  class Main{
    public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);
      int a = stdIn.nextInt();
      int b = stdIn.nextInt();
      int[] S = {a+b,a-b,a*b};
      int M = S[0];
      for(int i=0; i<=2; i++){
        if(M <= S[i]){
          M = S[i];
        }
      }
      System.out.println(M);
    }
  }