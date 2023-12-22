import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 記号を格納
        String[] arr;
        arr = new String[4];

        // 文字列の取得
        String str = sc.nextLine();

        for (int i = 0; i < arr.length; i++) {
        	arr[i] = str.split("")[i];
        }

        // 結果を保持
        int result = 0;

        // 計算
        for (String item : arr) {
        	switch(item) {
        	case "+":
        		result++;
        		break;
        	case "-":
        		result--;
        		break;
        	}
        }

        System.out.println(result);

    }
}