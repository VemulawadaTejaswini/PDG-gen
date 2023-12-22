import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = Integer.parseInt(sc.nextLine());
    int[] num = new int[N];
    for(int i = 0; i < N; i++){
      num[i] = Integer.parseInt(sc.next());
    }
    int ans = 0;
    
    for(int i = 1; i < N-1; i++){
      if((num[i-1] <= num[i] && num[i] <= num[i+1])
        	|| (num[i-1] >= num[i] && num[i] >= num[i+1])){
        ans++;
      }
    }
    System.out.println(ans);
  }
}