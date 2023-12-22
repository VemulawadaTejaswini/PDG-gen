import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int sen =  N / 1000;
    int ans = 0;
    if(N % 1000 == 0) ans = 0;
    else if(sen == 0) ans = 1000 -N ;
    else ans = 1000*(sen+1) - N;
    System.out.println(ans);
  }
}