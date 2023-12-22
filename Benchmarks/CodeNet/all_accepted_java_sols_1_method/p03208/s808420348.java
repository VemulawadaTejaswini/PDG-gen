import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<Integer>();
	  int all = scan.nextInt();
    int extraction  = scan.nextInt();
    int b=0;
    for(int i = 0; i<all;i++){
      b=scan.nextInt();
      list.add(b);
    }
    Collections.sort(list);
    int ans=2147483647;
    for(int i = 0;i<(all-extraction+1);i++){
      if(ans>list.get(i+extraction-1)-list.get(i)) ans = list.get(i+extraction-1)-list.get(i);
      // System.out.println("今は"+list.get(i+extraction-1));
      // System.out.println("今は2回目"+list.get(i));
    }
    System.out.println(ans);
}
}
