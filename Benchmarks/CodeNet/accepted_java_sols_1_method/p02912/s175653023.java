import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    PriorityQueue p=new PriorityQueue<>(n,Collections.reverseOrder());
    for(int i=0;i<n;i++){
      p.add(a[i]);
    }
    while(m>0){
        int k=(int)p.poll();
        k/=2;
        p.add(k);
        m--;
    }

    long ans=0;

    for(int i=0;i<n;i++){
      ans+=(int)p.poll();
    }

    System.out.println(ans);


    sc.close();
  }
}

