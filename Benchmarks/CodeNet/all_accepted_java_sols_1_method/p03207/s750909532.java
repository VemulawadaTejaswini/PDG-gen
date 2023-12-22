import java.util.*;

public class Main{
  public static void main(String[] args){
    ArrayList<Integer> list = new ArrayList<Integer>();
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b=0;
    for(int i = 0; i < a; i++){
      b = scan.nextInt();
      list.add(b);
    }
    Collections.sort(list);
    int ans=0;
    for(int i = 0;i<a;i++){
      if(i==(a-1)) ans+=list.get(i)/2;
      else ans+=list.get(i);
    }
    System.out.println(ans);
  }
}
