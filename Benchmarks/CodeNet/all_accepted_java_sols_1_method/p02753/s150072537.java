import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
      	//数値の入力
		String s = sc.next();
 		//AとB両方含む
      	if(s.contains("A") && s.contains("B")){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
     }
}