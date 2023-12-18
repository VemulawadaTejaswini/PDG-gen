import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long n = scan.nextInt();
    long ans = 1;
    for(long l=0;l<n;l++){
      ans *= scan.nextInt();
    }
    System.out.println((ans>1000000000000000000)?-1:ans);
  }
}