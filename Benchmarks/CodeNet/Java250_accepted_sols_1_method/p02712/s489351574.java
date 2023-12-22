import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    long ans = 0;
    //int[] a = new int[N];
    for(int i=1; i<=N; i++){
      //if(i%3!=0 && i%5!=0){
      if(i%3==0 || i%5==0){
        continue;
      } else {
        ans+=i;
      }
      //a[i] = sc.nextInt();
      //if(i%3==0 && i%5==0){
        //a[i]="FizzBuzz";
      //} else if(i%3==0) {
        //a[i]="Fizz";
      //} else if(i%5==0) {
        //a[i]="Buzz";
      //} else {
        //a[i]=String.valueOf(i);
      //}
    }
    System.out.println(ans);
  }
}