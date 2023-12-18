import java.util.*;

 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x = sc.nextInt();
    int a[] = new int[N];
    // Integer a[] = new Integer[N];
    for(int i=0; i<N ;i++){
        a[i] = sc.nextInt();
    }
    Arrays.sort(a);
    int sum =0;

    for(int j=0; j<N; j++){
        if (x >= a[j]) {
        x = x - a[j];
        sum++;
        }
    }
    if(x > 0 && sum == N){
        sum--;
    }
        System.out.println(sum); 
    }    
}
