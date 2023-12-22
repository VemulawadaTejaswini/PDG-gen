import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int k=in.nextInt();
    ArrayList<Integer> arr=new ArrayList<Integer>(n);
    for(int i=0;i<n;i++)
      arr.add(in.nextInt());
    Collections.sort(arr);
    int ans=0;
    for(int i=0;i<k;i++)
      ans+=arr.get(i);
    System.out.println(ans);
  }
}