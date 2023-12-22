import java.util.Scanner;
public class Main{
  public static void main(String[] args){
      Scanner sc =new Scanner(System.in);
    int ans=0;
    String str=sc.next();

    for(int i=0;i<str.length();i++){
     char a;
     a=str.charAt(i);
      switch (a){
        case '+':
          ans++;
          break;
        default:
          ans--;
          break;
      }
    }
    System.out.println(ans);

  }
}