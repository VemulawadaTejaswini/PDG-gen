import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int cnt = sc.nextInt();
    int sum = sc.nextInt();
    int[] moneys = {-1, -1, -1};
    
    for(int i = 0; i <= cnt; i++){
        for(int j = 0; j <= (cnt-i); j++){
            for(int k = 0; k <= (cnt-i-j); k++){
                if(i*10000 + j*5000 + k*1000 == sum &&
                    i + j + k == cnt){
                    moneys[0] = i;
                    moneys[1] = j;
                    moneys[2] = k;
                }
            }
        }
    }
    System.out.printf("%d %d %d", moneys[0], moneys[1], moneys[2]);
  }
}