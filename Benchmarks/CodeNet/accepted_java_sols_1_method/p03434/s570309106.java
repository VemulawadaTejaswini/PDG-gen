import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
    
		// 整数の入力
		int n = sc.nextInt();
       
        Integer[] list = new Integer[n];
       
        for(int i = 0; i < n; i++) {
          list[i] = sc.nextInt();
        }
        
        Arrays.sort(list, Comparator.reverseOrder());
        int alice = 0;
        int bob = 0;
        for(int i = 0; i < list.length; i++) {
          if (i % 2 == 0) {
            alice += list[i];
          } else {
            bob += list[i];
          }
        }
    
		// 出力
		System.out.println(alice - bob);
	}
}