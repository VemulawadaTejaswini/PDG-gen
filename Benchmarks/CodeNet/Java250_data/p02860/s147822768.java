import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[] S = sc.next().toCharArray();
    boolean isSame = true;
    if(N%2 != 0){
      System.out.print("No");
    }else{
      for(int i=0; i<N/2; i++){
        if(S[i] != S[i+(N/2)]){
          isSame = false;
        }
      }
      if(isSame){
        System.out.print("Yes");
      }else{
        System.out.print("No");
      }
    }
  }
}
    
