import java.util.*;

public class Main{
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
      int num=arr.size();
      long ans=getCount(arr,num,n);
      if(ans==0)
        System.out.println(0);
      else
      System.out.println(ans+1);
    }
    public static long getCount(ArrayList<Integer> arr,int m,int n){
      long[] table = new long[n+1];
      Arrays.fill(table, 0);
      table[0] = 1; 
      for (int i=0; i<m; i++) 
            for (int j=arr.get(i); j<=n; j++) 
                table[j] += table[j-arr.get(i)]; 
  
        return table[n]; 
    }
}
