import java.util.*;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int[] l=new int[n];
    for(int i=0;i<n;i++){
      l[i]=sc.nextInt();
    }
    int sum=0;
    int max=0;
    for(int i=0;i<n;i++){
      sum+=l[i];
      max=Math.max(max,l[i]);
    }
    if(sum>max*2){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}