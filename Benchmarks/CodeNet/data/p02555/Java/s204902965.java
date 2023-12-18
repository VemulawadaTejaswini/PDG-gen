import java.util.*;
import java.io.*;
 
public class Main{
  Scanner sc = new Scanner(System.in);	
 
  int memo[] = new int[2001];
  int mod = 1_000_000_000 + 7;
 
  int solve(int s){
  	if(memo[s] >= 0){
    	return memo[s];
    }
    int res = 1;
    for(int i = 3; s-i >= 3; i++){
    	res += solve(i);
    }
    memo[s] = res;
    return memo[s];
  }
  
  public void run(){
    int s = sc.nextInt();
    Arrays.fill(memo, -1);
    memo[0] = 0;
    memo[1] = 0;
    memo[2] = 0;
    memo[3] = 1;
    int res = solve(s);
    System.out.println(res);
  }
  public static void main(String[] args){
    Main m = new Main();
    m.run();
  }
}