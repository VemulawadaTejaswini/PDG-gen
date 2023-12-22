import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
      	int n = sc.nextInt();
		String s = sc.next();
      	int count =0;
      	int index = 0;
      	while(true) {
        index = s.indexOf("R", index) + 1;
        if (index == 0) break;
        count++;
		}
        if(count > n-count){
         System.out.println ("Yes");
        }else{
          System.out.println ("No");
      }
     }
}