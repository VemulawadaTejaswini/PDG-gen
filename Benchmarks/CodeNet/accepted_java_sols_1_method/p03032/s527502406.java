import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int k=sc.nextInt();
    int[] v=new int[n];
    for(int i=0;i<n;i++){
      v[i]=sc.nextInt();
    }
    
//    System.err.println(Arrays.toString(v));
    
    int max=0;
    for(int l=0;l<=Math.min(n,k);l++){
      for(int r=0;r<=Math.min(n-l,k-l);r++){
        
//        System.err.println("l:"+l+",r:"+r);
        
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<l;i++){
          pq.add(v[i]);
        }
        for(int i=0;i<r;i++){
          pq.add(v[n-i-1]);
        }
        for(int t=0;t<k-l-r;t++){
          if(pq.isEmpty()){
            break;
          }
          int g=pq.peek();
          if(g>=0){
            break;
          }
          pq.poll();
        }
        int here=0;
        while(!pq.isEmpty()){
          here+=pq.poll();
        }
//        System.err.println(here);
        max=Math.max(here,max);
      }
    }
    System.out.println(max);
  }
}