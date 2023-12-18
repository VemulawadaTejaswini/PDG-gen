import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      ArrayList<Integer> b = new ArrayList<>(n);
      ArrayList<Integer> a = new ArrayList<>();
      for(int i = 0;i < n;i++)b.add(sc.nextInt());
      while(b.size()!=0){
      	int r = -1;
        for(int i = 0;i < b.size();i++)if(b.get(i)==i+1)r=i;
        if(r==-1){
          System.out.println(-1);
          return;
        }
        b.remove(r);
        a.add(r+1);
      }
      Collections.reverse(a);
      for(int c:a)System.out.println(c);
    }
}