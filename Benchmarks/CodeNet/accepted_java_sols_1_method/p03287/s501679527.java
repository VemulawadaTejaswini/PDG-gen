import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int[] a=new int[n];
    int[] wa=new int[n+1];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    for(int i=1;i<=n;i++){
      wa[i]=(wa[i-1]+a[i-1])%m;
    }
    Map<Integer,Integer> mp=new HashMap<>();
    for(int i=0;i<n+1;i++){
      mp.put(wa[i],mp.getOrDefault(wa[i],0)+1);
    }
    long ans=0;
    for(Map.Entry<Integer,Integer> me:mp.entrySet()){
      ans=ans+(1L*me.getValue()*(me.getValue()-1));
    }
    System.out.println(ans/2);
  }
}