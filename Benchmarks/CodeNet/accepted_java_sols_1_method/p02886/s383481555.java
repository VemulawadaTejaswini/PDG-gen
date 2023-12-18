import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] d = new int[N];
  
    for(int i=0; i<N; i++){
    d[i] = sc.nextInt();
    }

    int m = 0;

    for(int i=0; i<N-1; i++){
       for(int j=i+1; j<N; j++){
          

             int a = d[i]*d[j];
             m += a;
          
       }
    }
    System.out.println(m);
  }
}