import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] s = sc.nextLine().split(" ");
    int N = Integer.parseInt(s[0]);
    int x = Integer.parseInt(s[1]);
    int[] candy = new int[N];
    for(int i = 0; i < N; i++){
      candy[i] = Integer.parseInt(sc.next());
    }
    Arrays.sort(candy);
    
    int count = 0;
    for(int i = 0; i < N; i++){
      x-= candy[i];
      if(x >= 0){
        count++;
      }else{
        break;
      }
    }
    if(x > 0){
      count--;
    }
    System.out.println(count);
  }
}