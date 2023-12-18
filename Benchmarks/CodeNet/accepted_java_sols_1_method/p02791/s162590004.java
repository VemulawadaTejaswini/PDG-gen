import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] P = new int[N];
    int count = 1;
    for(int i =0; i<N; i++){
      	P[i] = sc.nextInt();
    }
    int min = P[0];
    
    for(int i = 1; i<N; i++){
      if(min >= P[i]){
        count++;
        min = P[i];
      }

    } 
    System.out.println(count);
  }
}
