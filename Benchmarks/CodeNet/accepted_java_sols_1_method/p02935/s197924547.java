import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int v[]=new int[n];
    for(int i=0;i<n;i++){
      v[i]=sc.nextInt();
    }
    sc.close();
    Arrays.sort(v);
    double sum=v[0]*(1/(Math.pow(2,n-1)));
    for(int i=1;i<n;i++){
      sum+=v[i]*(1/(Math.pow(2,n-i)));
    }
    System.out.println(sum);
  }
}