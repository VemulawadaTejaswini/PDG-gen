import java.util.*;
class Main{
  public static void main(String[] args){
Scanner sc=new Scanner(System.in);
     long n=sc.nextLong();
    long a[]=new long[(int)n+1];
    Arrays.fill(a,1);
    for(int i=2;i<=n;i++){
for(int j=i;j<=n;j+=i){    //O(logN)
a[j]++;
}
    }
    long sum=0;
    for(int i=1;i<=n;i++){
sum+=(i*a[i]);
    }
    System.out.println(sum);
  }
}
    
  
