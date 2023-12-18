import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    int allcount = 0;
    for(int C = 1; C < N; C++){
      int count = 0;
      int max = N-C;
      for(int A = 1; A <= Math.sqrt(max); A++){
        if(max % A == 0) {
            count++;
        }
      }
      count *= 2;
      if (Math.floor(Math.sqrt(max)) * Math.floor(Math.sqrt(max)) == max){
        count--;
      }
      allcount += count;
    }

    System.out.println(allcount);	
  }
}