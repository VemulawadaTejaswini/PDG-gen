import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();
        
        System.out.println(a < b && b < c ? "Yes" : "No");
    }
}

// ３つの整数a, b, cを読み込み、それらが a < b < cの条件を満たすならば"Yes"を、満たさないならば"No"を出力するプログラムを作成して下さい。
// Sample Input 1
// 1 3 8
// Sample Output 1
// Yes
// Sample Input 2
// 3 8 1
// Sample Output 2
// No

