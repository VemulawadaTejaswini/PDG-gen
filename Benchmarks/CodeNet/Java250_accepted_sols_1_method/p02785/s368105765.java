import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int enemy = sc.nextInt();
    int pp = sc.nextInt();sc.nextLine();
    String[] string = sc.nextLine().split(" ");
    long[] input = new long[enemy];
    
    for(int i = 0; i < enemy; i++){
      input[i] = Long.parseLong(string[i]);
    }
    Arrays.sort(input);
    while(pp > 0){
      enemy--;
      pp--;
    }
    long sum = 0;
    for(int i = 0; i < enemy; i++){
      sum += input[i];
    }
    
    
    System.out.println(sum);
  }
}