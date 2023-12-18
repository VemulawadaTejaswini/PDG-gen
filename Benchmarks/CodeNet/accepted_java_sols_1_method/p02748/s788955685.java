import java.util.*;

class Main{
  public static void main(String[] arg){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    
    int mina = 1000000;
    int minb = 1000000;
    
    int[] ai = new int[a];
    int[] bi = new int[b];
    
    for(int i=0;i<a;i++){
      ai[i] = sc.nextInt();
      if(ai[i]<mina)
        mina = ai[i];
    }
    for(int i=0;i<b;i++){
      bi[i] = sc.nextInt();
      if(bi[i] < minb)
        minb = bi[i];
    }
    
    int[] c  = new int[m];
    int[] x  = new int[m];
    int[] y  = new int[m];
    
    for(int i=0;i<m;i++){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      c[i] = sc.nextInt();
    }
    
    int ans = mina + minb;
    int tmp;
    
    for(int k=0;k<m;k++){
      tmp = ai[x[k]-1] + bi[y[k]-1] -c[k];
      if(tmp<ans)
        ans = tmp;
    }
    
    
    System.out.print(ans);
  }
}