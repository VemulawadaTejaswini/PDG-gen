import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    long L = scanner.nextLong();
    long R = scanner.nextLong();
    long min = 2018;
    
    if((R-L)<2019){
      for(long i=L; i<R; i++){
        for(long j=(i+1); j<=R; j++){
          if(min>i*j%2019){
            min = i*j%2019;
          }
        }
      }
    }else{
      min = 0;
    }
    System.out.println(min);
    
  }
}