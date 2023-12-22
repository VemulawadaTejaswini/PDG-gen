import java.util.Scanner;

public class Main {
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);

    int N = in.nextInt();
    int i = 1000;
    
	while(i<N){
      i += 1000;
    }
    
    System.out.println(i - N);
  }
}