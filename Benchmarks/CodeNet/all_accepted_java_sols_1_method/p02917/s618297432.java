import java.util.*;

class Main{
  static Scanner sc = new Scanner(System.in);
  public static void main(String args[]){
    int n = sc.nextInt();
    int b[] = new int[n+1];
    b[0] = Integer.MAX_VALUE;
    b[n] = Integer.MAX_VALUE;
    for(int i=1;i<n;i++){
      b[i]=sc.nextInt();
    };
    int a=0;
    for(int i=0;i<n;i++){
      a+=Integer.min(b[i],b[i+1]);
    }
    System.out.println(a);
  }
}