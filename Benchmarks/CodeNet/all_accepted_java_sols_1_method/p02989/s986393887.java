import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int d[] = new int[N];
    for(int i=0;i<N;i++){
      d[i]=sc.nextInt();
    }
    Arrays.sort(d);
    int h = N/2;
    int midu=d[h];
    int midl=d[h-1];
    System.out.println(midu-midl);
  }
  

  
}