import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    
    int[] array = {n1,n2,n3};
    int matchCount1 = 0;
    int matchCount2 = 0;
    for(int val : array){
      if(val == 5){
        matchCount1++;
      }else if(val == 7){
        matchCount2++;
      }
    }
    
    if(matchCount1 == 2 && matchCount2 == 1){
      System.out.println("YES");
    } else{
      System.out.println("NO");
    }
  }
}