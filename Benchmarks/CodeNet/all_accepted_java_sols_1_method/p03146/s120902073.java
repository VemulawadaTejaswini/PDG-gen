import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int s = sc.nextInt();
        boolean ans = true;
        int count = 1;
      
        List<Integer> list = new ArrayList<Integer>();
        list.add(s);
        while(ans == true){
          if(s % 2 == 0){
            s = s / 2;
          }else{
            s = s * 3 + 1;
          }
          list.add(s);
           
          ans = (list.size() == new HashSet<>(list).size());
          count++;
        }
        
        
        
        System.out.println(count);
    }
}