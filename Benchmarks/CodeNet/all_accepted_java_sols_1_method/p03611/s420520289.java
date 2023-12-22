import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] t=new int[100002];
    for(int i=0;i<n;i++){
      int a=sc.nextInt();
      t[a]++;
      t[a+1]++;
      t[a+2]++;
    }
    int max=0;
    for(int i=0;i<100002;i++){
      max=Math.max(t[i],max);
    }
    System.out.println(max);
  }
}