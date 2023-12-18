import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String s = sc.next();
        int n = sc.nextInt();
        String ans[] = s.split("");
        int i;
      	for(i = 0;i < s.length();i++){
          if(i == 0 || i % n == 0){
            System.out.print(ans[i]);
          }
          
        }
    }
}