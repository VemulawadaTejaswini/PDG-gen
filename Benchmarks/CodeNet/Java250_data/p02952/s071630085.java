import java.util.*;
 
public class Main {
  public static void main (String[] arg) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int sum = 0;
    
    if(N >= 1 && N < 10){
      sum += N;
    } else if (N >= 10){
      sum += 9;
    }
    
    if(N/100 >= 1 && N/100 < 10){
      sum += N - 99;
    } else if (N/100 >= 10){
      sum += 900;
    }
    
    if(N/10000 >= 1 && N/10000 < 10){
      sum += N - 9999;
    } else if (N/10000 == 10){
      sum += 90000;
    }
    System.out.println(sum);
  }
}