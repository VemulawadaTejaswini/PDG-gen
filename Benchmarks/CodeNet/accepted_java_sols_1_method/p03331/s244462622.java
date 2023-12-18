import java.util.*;
 
public class Main{
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = 0;
    int sum = 0;
    int ans = 100000;
    
    for(int i = 1; i <= n/2; i++){
      
        a = n-i;
        String I = String.valueOf(i);
        String A = String.valueOf(a);
        char[] ii = I.toCharArray();
        char[] aa = A.toCharArray();
        for(int j = 0; j < ii.length; j++){
          int itmp = Character.getNumericValue(ii[j]);
          sum += itmp;
        }
        for(int k = 0; k < aa.length; k++){
          int atmp = Character.getNumericValue(aa[k]);
          sum += atmp;
        }
        
        if(sum < ans){
          ans = sum;
        }
      
      sum = 0;
    }
    
    System.out.println(ans);
  }
}