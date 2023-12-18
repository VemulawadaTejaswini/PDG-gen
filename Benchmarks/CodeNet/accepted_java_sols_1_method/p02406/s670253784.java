import java.util.*;
/*このプログラムには、ひとつがもうひとつを含むような
２つのループ構造があります。まずは goto 文によるループ構造を 
for 文あるいは while 文に置き換えてみましょう。
call は与えられた整数 n について、1 から n
までの数の中で、3 の倍数と 3 が含まれる数を標準出力に出力します。 */
public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();

        int i;
//      int j;
//３で割り切れる、あるいは１桁が３の数
//３０、３００、３０００ 代の数字             

        for ( i = 1; i <= n; i++ ){
            if (i % 3 == 0 || Integer.toString(i).contains("3")) {            
                 System.out.print(" " + i);
            }
        }System.out.println();
    }
}
