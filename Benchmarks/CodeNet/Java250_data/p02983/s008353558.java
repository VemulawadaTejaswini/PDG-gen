import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long l = sc.nextLong();
    long r = sc.nextLong();
    
    r   = Math.min(r, l+2019);
    long min = 2018;
    for(long i = l; i <= r; i++)
      for(long j = i+1; j <= r; j++)
          min = Math.min(min, i*j%2019);
    System.out.println(min); 
  }
}