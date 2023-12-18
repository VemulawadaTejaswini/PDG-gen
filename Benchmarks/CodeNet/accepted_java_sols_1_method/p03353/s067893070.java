import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int k=sc.nextInt();
    PriorityQueue<String> pq=new PriorityQueue<>();
    for(int i=0;i<s.length();i++){
      for(int j=i+1;j<=i+5&&j<=s.length();j++){
        pq.add(s.substring(i,j));
      }
    }
    Set<String> set=new HashSet<>();
    String ans="";
    while(set.size()<k){
      ans=pq.poll();
      set.add(ans);
    }
    System.out.println(ans);
  }
}