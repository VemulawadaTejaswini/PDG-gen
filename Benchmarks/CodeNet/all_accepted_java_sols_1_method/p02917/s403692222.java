import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] num = new int[N];
    int count = 0;

    for(int i=0; i < N-1; i++){
        num[i] = sc.nextInt();
        if(i > 0){
            if(num[i-1] >= num[i]){
                count += num[i];
                //System.out.println(count);
            }else if(num[i-1] < num[i]){
                count += num[i-1];
                //System.out.println(count);
            }
        }else{
            
        }
    }
        System.out.println(count+num[0]+num[N-2]);
  }
}