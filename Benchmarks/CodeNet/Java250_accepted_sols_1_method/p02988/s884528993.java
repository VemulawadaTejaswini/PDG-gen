import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] num = new int[N];
    int count = 0;

    for(int i=0; i < N; i++){
        num[i] = sc.nextInt();
        if(i > 1){
            if(num[i-2] > num[i-1] && num[i-1] > num[i]){
                count++;
            }else if(num[i-2] < num[i-1] && num[i-1] < num[i]){
                count++;
            }
        }
    }

        System.out.println(count);
  }
}