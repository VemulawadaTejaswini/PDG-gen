import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = Long.parseLong(sc.next());
    
    long min = N-1;
    long sqrt = (long)Math.sqrt(N);
    for(long i=2;i<=sqrt;i++){
      if(N%i==0){
        if(i-1+N/i-1<min){
          min = i-1+N/i-1;
        }
      }
    }
    System.out.print(min);
    System.out.flush();
  }
}