import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer>p = new ArrayList<>();
    for(int i=0;i<n;i++){
      p.add(sc.nextInt()-1);
    }
    int ans = 0;
    for(int i=1;i<n-1;i++){
      if((p.get(i)-p.get(i-1))*(p.get(i+1)-p.get(i))>0)ans++;
    }
    System.out.println(ans);

  }
}
