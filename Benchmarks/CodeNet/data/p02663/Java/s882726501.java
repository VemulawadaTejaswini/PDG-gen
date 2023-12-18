import java.util.ArrayList;
import java.util.Scanner;

public class AA {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Integer> IntList = new ArrayList<Integer>();
    static ArrayList<String> StrList = new ArrayList<String>();
    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ



    	int ans1 = sc.nextInt();
    	int ans2 = sc.nextInt();
    	int ans3 = sc.nextInt();
    	int ans4 = sc.nextInt();
    	int ans5 = sc.nextInt();

    	int cont = 0;

    	int a = ans3 - ans1;

    	int ans = a * 60;

    	int sum = ans - ans2 - ans4 - ans5;

    	System.out.println(sum);



    }
}