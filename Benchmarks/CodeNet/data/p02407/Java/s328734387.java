import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        try {
            int N = Integer.parseInt(br.readLine());
 
            String array[] = br.readLine().split("\\s+");
 
            System.out.printf("%d",Integer.parseInt(array[array.length-1]));
            for(int i = array.length-2; i >= 0; i--){
                System.out.printf(" %d", Integer.parseInt(array[i]));
            }
            System.out.printf("\n");
 
 
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

Compile Error Logs:

ステータス
Judge: 4/4	JAVA	CPU: 00:06 sec	Memory: 24840 KB	Length: 760 B	2018-01-20 23:26
テストケースの判定結果
Case #	Verdict	CPU Time	Memory	In	Out	Case Name
Case #1	: Accepted	00:04	24520	40	37	testcase_00
Case #2	: Accepted	00:04	24724	197	194	testcase_01
Case #3	: Accepted	00:04	24432	6	4	testcase_02
Case #4	: Accepted	00:06	24840	394	390	testcase_03

< prev |		/		| next >	 		
 
Judge Input #  ( | )		Judge Output #  ( | )

