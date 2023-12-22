import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    List<Integer>p = new ArrayList<>();
    for(int i=0;i<n;i++){
      p.add(sc.nextInt()-1);
    }
    int a = 0;
    for(int i=0;i<n;i++){
      if(p.get(i)!=i)a++;
    }
    if(a<=2)System.out.println("YES");
    else System.out.println("NO");

  }
}
