import java.util.Scanner;
 
public class Main {  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] a = new int[N];
    int[] count = new int[100001];
    int amax =0, amin =100000;
    for (int i =0; i<N; i++) {
      a[i] = sc.nextInt();
      amax = Math.max(a[i],amax);
      amin = Math.min(a[i],amin);
      count[a[i]]++;
    }
    int max =0;
    for (int i =Math.max(0,amin-2); i<=Math.max(0,amax-2); i++) {
      max = Math.max(count[i] + count[i+1] + count[i+2],max);
    }
    System.out.println(max);  
  }
}