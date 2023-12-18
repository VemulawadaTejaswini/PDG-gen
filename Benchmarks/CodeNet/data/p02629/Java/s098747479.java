import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    String S = "";
    String A[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    while(N>26){
      long tmp = N%26-1L;
      S+=A[(int)tmp];
      N/= 26L;
      // System.out.println(N);
    }
    S+=A[(int)N-1];
    StringBuffer str = new StringBuffer(S);
    String S2 = str.reverse().toString();
    System.out.println(S2);

  }
}

// 1000000000000001
// 9223372036854775807