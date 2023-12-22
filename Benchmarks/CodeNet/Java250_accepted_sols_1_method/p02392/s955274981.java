import java.util.Scanner;

public class Main { 
	public static void main(String[] args){
        // 変数と配列
	String str;
        int inNumber1, inNumber2, inNumber3;
 
        // 各数字の入力
        Scanner scan = new Scanner(System.in);
        str = scan.next();
        inNumber1 = Integer.parseInt(str);
        str = scan.next();
        inNumber2 = Integer.parseInt(str);
        str = scan.next();
        inNumber3 = Integer.parseInt(str);

        // 条件判定
        if(inNumber1 < inNumber2 && inNumber2 < inNumber3)
                System.out.println("Yes");
        else
                System.out.println("No");
	}
}