import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    NavigableMap<Integer,Integer> mp=new TreeMap<>();
    for(int i=0;i<n;i++){
      Integer k=mp.lowerKey(a[i]);
//      System.out.println(k);
      if(k!=null){
        if(mp.get(k)==1){
          mp.remove(k);
        }else{
          mp.put(k,mp.get(k)-1);
        }
      }
      mp.put(a[i],mp.getOrDefault(a[i],0)+1);
    }
    int ans=0;
    for(Map.Entry<Integer,Integer> me:mp.entrySet()){
      ans+=me.getValue();
    }
    System.out.println(ans);
  }
}