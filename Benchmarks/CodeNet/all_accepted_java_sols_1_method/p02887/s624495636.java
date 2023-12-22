import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.next());
    String S = sc.next();  
    int cnt = 1;
    char tmp = S.charAt(0);
    for(int i=1;i<S.length();i++){
        if(S.charAt(i)!=tmp){
            cnt++;
        }
        tmp = S.charAt(i);
    }
    System.out.print(cnt);
    return;
  }
}

