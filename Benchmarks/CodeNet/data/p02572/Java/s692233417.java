import java.util.*;
class Main{

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
  //  Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    long[] arr = new long[n];
    for(int i=0; i<n; i++)
    arr[i] = sc.nextLong();
    long res =0;
    for(int i=0; i<n-1; i++) {
        for(int j=i+1; j<n; j++) {
     long tmp= (arr[i]*arr[j])%1000000009;
          res += tmp;
        }
    }
    res %= 1000000009;
    System.out.println(res);
       // System.out.println("Hello World");
    }
}
