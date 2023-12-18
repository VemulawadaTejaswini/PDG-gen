import java.util.Scanner;

class Main {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    String ans  =  "";
    String zero = "0";
    String one  = "1";

    if(n == 0){
      System.out.println("0");
      return;
    }
    
    while(n != 1){
      if(n % -2 == 0){
        ans = ans.concat(zero);
        n /= -2;
      }
      else if(n > 0){
        ans = ans.concat(one);
        n /= -2;
      }
      else{
        ans = ans.concat(one);
        n /= -2;
        n++;
      }       
    }
    ans = ans.concat(one);

    StringBuffer buf = new StringBuffer(ans);
    String res = buf.reverse().toString();

    System.out.println(res);

  }
}