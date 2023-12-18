import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    String S = "";
    String A[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    while(N>26){
      long tmp = (N-1L)%26;
      // if(tmp==-1L){
      //   tmp = 25L;
      // }
      S+=A[(int)tmp];
      N = (N -1L) /26L ;
      // System.out.println(N);
    }
    long tmp2 = N-1L;
    // if(tmp2==-1L){
    //   tmp2 = 25L;
    // }
    S+=A[(int)tmp2];
    StringBuffer str = new StringBuffer(S);
    String S2 = str.reverse().toString();
    System.out.println(S2);

  }
}

// 1000000000000001
// 9223372036854775807