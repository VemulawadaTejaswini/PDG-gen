import java.util.*;
class Main{
	public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      Set t = new HashSet<Integer>();
      boolean ok = true;
      for(int i = 0;i<a;i++){
        t.add(sc.nextInt());
      }

      if(t.size()==a)System.out.println("YES");
      else System.out.println("NO");
    }
}