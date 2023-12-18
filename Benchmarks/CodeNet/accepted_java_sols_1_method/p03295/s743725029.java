import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    long pos[] = new long[m];
    for(int i=0;i<m;++i)pos[i]=sc.nextLong()+sc.nextLong()*(long)(n+1);
    Arrays.sort(pos);
    int ans = 0;
    int brg = -1;
    for(int i=0;i<m;++i){
      if(brg<=pos[i]%(long)(n+1)){
        brg=(int)(pos[i]/(long)(n+1));++ans;
      }
    }
    System.out.println(ans);
  }
}