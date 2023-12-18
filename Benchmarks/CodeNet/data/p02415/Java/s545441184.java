import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    public static final int BIG_NUM  = 2000000000;
    public static final int MOD  = 1000000007;
 
    public static void main(String[] args) {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char ch;
 
 
        try {
 
            String inputed = br.readLine();
 
            for(int i = 0; i < inputed.length(); i++){
                ch = inputed.charAt(i);
 
                if(ch >= 'a' && ch <= 'z'){
                    System.out.print((char)(ch-32));
                }else if(ch >= 'A' && ch <= 'Z'){
                    System.out.print((char)(ch+32));
                }else{
                    System.out.print((char)ch);
                }
            }
            System.out.printf("\n");
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
Compile Error Logs:

ステータス
Judge: 4/4 	JAVA 	CPU: 00:07 sec 	Memory: 25308 KB 	Length: 749 B 	2018-01-25 21:10
テストケースの判定結果
Case # 	Verdict 	CPU Time 	Memory 	In 	Out 	Case Name
Case #1	: Accepted	00:03	24116	34	34	testcase_00
Case #2	: Accepted	00:03	24484	2	2	testcase_01
Case #3	: Accepted	00:03	24324	27	27	testcase_02
Case #4	: Accepted	00:07	25308	1149	1149	testcase_03
< prev | 		/ 		| next > 	  		
 
Judge Input #  ( | ) 		Judge Output #  ( | )

		


