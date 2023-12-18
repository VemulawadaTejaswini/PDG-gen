import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<k;i++){
      int a=s.nextInt();
      int b=s.nextInt();
      if(!arr.contains(a))
        arr.add(a);
      if(!arr.contains(b))
        arr.add(b);
      }
      int ans=getCount(arr,n,n);
      System.out.println(ans);
    }
    public static int getCount(ArrayList<Integer> arr,int n,int sum){
      if(sum==0)
        return 1;
      if(n==0)
        return 0;
      int res=getCount(arr,n-1,sum);
      if(arr.get(n-1)<=sum)
        res+=getCount(arr,n,sum-arr.get(n-1));
      return res;
    }
}
