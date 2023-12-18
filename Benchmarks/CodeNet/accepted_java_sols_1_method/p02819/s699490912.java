import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    l :
    for(int i = N;true; i++){
        for(int j = 2; j <= Math.sqrt(N); j++){
            if(i%j == 0){
                continue l;
            }
        }
        System.out.println(i);
        return;
    }
  }
}