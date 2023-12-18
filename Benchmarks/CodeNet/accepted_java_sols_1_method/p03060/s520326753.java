import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int []a = new int[N];
    int []b = new int[N];
    int sum=0;
    for(int i=0;i<N;i++){
      a[i]=sc.nextInt();
    }
    for(int i=0;i<N;i++){
        b[i]=sc.nextInt();
    }
    for(int i =0;i<N;i++)
        if(a[i]>b[i]){
            sum= sum + a[i]-b[i];
        }
    System.out.println(sum);
    } 
}