import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    char[] s = sc.next().toCharArray();
    boolean bl = true;
    if(n % 2 == 0){
      for(int i = 0; i < n / 2; i++){
        if(s[i] == s[n / 2 + i]){
          continue;
        }else{
          bl = false;
          break;
        }
      }
      }else{
        bl = false;
      }
      if(bl){
        System.out.println("Yes");
      }else{
        System.out.println("No");
    }
  }
}