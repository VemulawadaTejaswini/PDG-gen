import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            
            int m = scanner.nextInt();
            int f = scanner.nextInt();
            int r = scanner.nextInt();
            
            if (m==-1 && f==-1 && r==-1) {
                break;
            }
            
            /* 中間試験: m   期末試験: f   再試験: r
中間試験、期末試験のいずれかを欠席した場合成績は F。
中間試験と期末試験の合計点数が 80 以上ならば成績は A 。
中間試験と期末試験の合計点数が 65 以上 80 未満ならば成績は B。
中間試験と期末試験の合計点数が 50 以上 65 未満ならば成績は C。
中間試験と期末試験の合計点数が 30 以上 50 未満ならば成績は D。 ただし、再試験の点数が 50 以上ならば成績は C。
中間試験と期末試験の合計点数が 30 未満ならば成績は F。
            */
            String result = "";
            if ( m==-1 || f==-1 ) {
                result = "F";
            } else if ( 80 <= m + f ) {
                result = "A";
            } else if ( 65 <= m + f && m + f < 80 ) {
                result = "B";
            } else if ( 50 <= m + f && m + f < 65 ) {
                result = "C";
            } else if ( 30 <= m + f && m + f < 50 ) {
                result = "D";
                if ( 50 <= r ) { 
                    result = "C";
                }
            } else {
                result = "F";
            }
            System.out.println(result);
        }
        
    }
}
