import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer>v = new ArrayList<>();
    List<Integer>c = new ArrayList<>();
    int ans = 0;
    for(int i=0;i<n;i++){
      v.add(sc.nextInt());
    }
    for(int i=0;i<n;i++){
      c.add(sc.nextInt());
    }
    for(int i=0;i<n;i++){
      int tmp=v.get(i)-c.get(i);
      if(tmp>0)ans+=tmp;
    }
    System.out.println(ans);

  }
}
