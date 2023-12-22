import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		String[] strs = sc.nextLine().split(" ");
      	int d = Integer.valueOf(strs[0]);
      	int t = Integer.valueOf(strs[1]);
      	int s = Integer.valueOf(strs[2]);
      	if(d<=t*s){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
	}
}
