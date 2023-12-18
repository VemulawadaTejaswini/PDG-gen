import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner scan;
    String S;
    String T;
    int Ss;
    String Sc;
    
    scan = new Scanner(System.in);
    S = scan.next();
    T = scan.next();

    Ss = S.length();
    Sc = T.substring(0, Ss);

    if (Sc = S){
        System.out.println("Yes");
    }else{
        System.out.println("No");
    }
  }
}
