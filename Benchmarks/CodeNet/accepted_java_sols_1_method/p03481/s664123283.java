import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//String tmp = sc.next();
		//int tmp = sc.nextInt();
		Long X = sc.nextLong();
      Long Y = sc.nextLong();
      ArrayList<Long> list = new ArrayList<Long>();
      list.add(X);
      while(true){
        if(list.size() == 1){
          if(X * 2 > Y){
            System.out.println(list.size());
            return;
          }else{
            list.add(X * 2);
          }
        }else{
          if(list.get(list.size() - 1) * 2 > Y){
            System.out.println(list.size());
            return;
          }else{
            list.add(list.get(list.size() - 1) * 2);
          }
        }
      }
	}
}
