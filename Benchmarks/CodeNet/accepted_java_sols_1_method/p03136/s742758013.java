import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int []a = new int[N];
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
    }
    int max = 0;
    int sum = 0;
    for(int i = 0; i < N; i++){
        sum = sum + a[i];
        if(a[i]>max){
            max = a[i];
        }
    }
    if(2*max < sum){
        System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
  } 
}