import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    char[] S = sc.next().toCharArray();
    char[] T = sc.next().toCharArray();
    StringBuilder sb = new StringBuilder();
    for(int i=0; i<N; i++){
      sb.append(S[i]);
      sb.append(T[i]);
    }
    System.out.print(sb.toString());
  }
}
      
