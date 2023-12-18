import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int []ary = new int[N];
    int count=0;
    for(int i = 0 ; i < N ; i++){
      ary[i] = sc.nextInt();
    }

    Arrays.sort(ary);
    for(int i = 0 ; i < N-2 ; i++){
      for(int j = i+1 ; j < N-1 ; j++){
        int high = N;
        int low = 0;
        while(high-low > 1){
          int middle = (high+low)/2;
          if(ary[middle] < ary[i] + ary[j]){
            low = middle;
          }else{
            high = middle;
          }
        }
        count += high-j-1;
      }
    }
    System.out.println(count);
  }
}
