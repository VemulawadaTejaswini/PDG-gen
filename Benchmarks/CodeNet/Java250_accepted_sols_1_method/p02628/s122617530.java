import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    int N=s.nextInt();
    int K=s.nextInt();
    int[] L=new int[N];
	for(int i=0;i<N;i++) L[i]=s.nextInt();
    Arrays.sort(L);
    int ans=0;
    for(int i=0;i<K;i++) ans+=L[i];
    System.out.println(ans);

  }  
}