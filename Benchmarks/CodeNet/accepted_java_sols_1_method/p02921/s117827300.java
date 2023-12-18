import java.util.Scanner;
class Main{
    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
    String T = scan.nextLine();

    int ans = 0;
    for(int i = 0; i < S.length(); i++){
      if(S.charAt(i) == T.charAt(i)){
        ans++;
      }
    }
    System.out.println(ans);
  }
}