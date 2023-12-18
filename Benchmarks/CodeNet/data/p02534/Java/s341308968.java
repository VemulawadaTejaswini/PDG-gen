import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
        int i = 0;
 
		String s = "ACL";
      if(a == 1){
       System.out.println(s);
      } else {
       String cats_tochu = "";
       String cats = "";
        for(i=1; i<a; i++){
           cats_tochu = cats_tochu + s;
	       cats = cats_tochu + s;
        }
	   System.out.println(cats);
      }
	}
}