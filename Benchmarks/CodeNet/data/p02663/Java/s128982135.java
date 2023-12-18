import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int h1 = sc.nextInt();
        int m1 = sc.nextInt();
		int h2 = sc.nextInt();
        int m2 = sc.nextInt();
		int k = sc.nextInt();   
        int hun = 0;
        int pun = 0;
		hun = k / 60;
        pun = k % 60;
        
        h1 += hun;
        m1 += pun;
        if(m1 >= 60){
         h1 += 1;
         m1 -= 60;
        }
        if(h1 == h2){
           System.out.println("0");
           System.exit(0);
        }
        hun = h2 - h1 - 1;
        pun = 60 - m1;
        
      	System.out.println(hun * 60 + pun);

    }
}