import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    char[] s = S.toCharArray();

    String alp = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char[] al = alp.toCharArray();

    for(int n = 0; n < s.length; n++){
      for(int i = 0; i < 26;i++){
        if(s[n] == al[i]){
          System.out.print(al[i+N]);
        }
      }
    }
  }
}
