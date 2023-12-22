import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 文字の入力
		char c = sc.next().charAt(0);;
		// 出力
      	int ascii;
      	ascii = (int)c;

        if(ascii>=65 && 90>=ascii) 
          System.out.println("A");
      	else 
          System.out.println("a");
	}
}