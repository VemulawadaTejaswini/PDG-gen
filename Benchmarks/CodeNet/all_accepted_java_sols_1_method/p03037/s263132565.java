import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int min = 0;
    int max = 100000;

    for(int i = 0;i < M;i++){
      int L = sc.nextInt();
      int R = sc.nextInt();
      
      if(min < L)min = L;
      if(max > R)max = R;
    }
    if(max - min >= 0)System.out.println(max - min+1); 
    else System.out.println("0"); 
  }
}