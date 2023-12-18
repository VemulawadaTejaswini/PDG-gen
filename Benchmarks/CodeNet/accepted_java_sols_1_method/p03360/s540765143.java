import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<Long> list = new ArrayList<>();
	list.add(Long.parseLong(sc.next()));
	list.add(Long.parseLong(sc.next()));
	list.add(Long.parseLong(sc.next()));
	int K = Integer.parseInt(sc.next());
    sc.close();
    int s = list.size();
    long c;
    int p;
    
    Collections.sort(list);
    for(int i = 0; i< K; i++){
      c = list.get(s-1);
      list.set(s-1 , c*2);
    }
    c = 0;
    for(int i = 0; i< s; i++){
      c += list.get(i);
    }
    
    System.out.println(c);
  }
}