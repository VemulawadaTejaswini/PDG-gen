import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int n=scn.nextInt();
    int k=scn.nextInt();
    ArrayList<Integer> p=new ArrayList<>();
    
    for(int i=0;i<n;i++){
      p.add(scn.nextInt());
    } 
    Collections.sort(p);
    int ans=0;
    for(int i=0;i<k;i++){
      ans+=p.get(i);
    }
    System.out.println(ans);
  }
}