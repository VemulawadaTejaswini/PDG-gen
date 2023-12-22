import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int ans = 0;
    Scanner sc = new Scanner(System.in);
    char[] s = sc.nextLine().toCharArray();
    for(int cnt = 0; cnt < s.length ; cnt++){
      if(s[cnt] == '1'){
        ans++;
      }
    }
    System.out.println(ans);
    sc.close();
  }
}