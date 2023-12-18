import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long sum = 0;
        //配列入力用
        Integer s[] = new Integer[n];

        for(int i=0;i<n;i++){
            s[i]= scan.nextInt();
            sum = sum + s[i];
        }
        Arrays.sort(s);
        System.out.println(s[0] + " " + s[n-1] + " " + sum); 

    }

}

