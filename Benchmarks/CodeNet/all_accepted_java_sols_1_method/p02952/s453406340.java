import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int m = n;
    
    int d = 1;
    while(m/10!=0){
      d++;
      m = m/10;
    }
    
    int count = 0;
    for(int i = 0; i < d - 1; i++){
      if(i%2==0){
        count += (int)Math.pow(10, (double)(i + 1)) - (int)Math.pow(10, (double)i);
      }
    }
    if(d%2==1){
      count += n - (int)Math.pow(10, (double)(d - 1)) + 1;
    }
    System.out.println(count);
  }
}
