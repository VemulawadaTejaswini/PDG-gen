import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Integer a[]=new Integer[n];
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
    Set s=new HashSet();
    for(int i=0;i<n;i++){
      s.add(a[i]);
    }
    if(s.size()==n){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}