import java.util.*;
class Main{
  static Integer []cache;
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    cache=new Integer[n];
    int []height=new int[n];
    for(int i=0;i<n;i++){
      height[i]=sc.nextInt();
    }
    System.out.println(ans(height,0));
  }
        
    public static int ans(int[] h,int index){
        if(index==h.length-1) return 0;
        if(cache[index]!=null) return cache[index];
        int one=Integer.MAX_VALUE;
        int two=Integer.MAX_VALUE;
        if(index+1<h.length){
            one=ans(h,index+1)+Math.abs(h[index]-h[index+1]);
        }
        if(index+2<h.length){
            two=ans(h,index+2)+Math.abs(h[index]-h[index+2]);
        }
        return cache[index]=Math.min(one,two);
    }
}