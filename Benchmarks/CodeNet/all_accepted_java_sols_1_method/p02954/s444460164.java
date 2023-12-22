import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next()+"R";
    int n=s.length()-1;
    int[] ans=new int[n];
    int l=0;
    int c;
    while(l<n-1){
      c=s.indexOf("RL",l);
      int r=s.indexOf("LR",c);
      ans[ c ]=(c-(l-1)+1)/2+(r-c  )/2;
      ans[c+1]=(c-(l-1)  )/2+(r-c+1)/2;
      l=r+1;
    }
    for(int i=0;i<n-1;i++){
      System.out.print(ans[i]+" ");
    }
    System.out.println(ans[n-1]);
  }
}