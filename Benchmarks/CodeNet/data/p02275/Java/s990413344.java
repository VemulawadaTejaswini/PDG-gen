import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main {
 
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
 
    private void solv() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
 
        int[] A = new int[n + 1];
        int[] B = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            A[i] = input.nextInt();
        }
         
        // C[i]???i???????????°????¨????
        int[] C = new int[10000];
        for (int i = 1; i <= n; i++) {
            C[A[i]]++;
        }
         
        // C[i]???i??\????????°???????????°????¨??????????
        for (int i = 1; i < C.length; i++) {
            C[i] += C[i - 1];
        }
         
        for(int i = 1; i <= n; i++){
            B[C[A[i]]] = A[i];
            C[A[i]]--;
        }
         
        print(B);
    }
 
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs)
            sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
 
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < xs.length; i++){
            sb.append(xs[i]).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
 
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
 
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
 
        public String next() {
            nextToken();
            return st.sval;
        }
 
        public Integer nextInt() {
            nextToken();
            return (int) st.nval;
        }
 
        private int nextToken() {
            int token = st.TT_EOF;
            try {
                token = st.nextToken();
            } catch (IOException e) {
            }
            return token;
        }
    }
}

Compile Error Logs:

ステータス
Judge: 10/10	JAVA	CPU: 00:63 sec	Memory: 156056 KB	Length: 1747 B	2016-03-29 22:49
テストケースの判定結果
Case #	Verdict	CPU Time	Memory	In	Out	Case Name
Case #1	: Accepted	00:04	24380	16	14	testcase_00
Case #2	: Accepted	00:03	24196	18	16	testcase_01
Case #3	: Accepted	00:03	24444	23	20	testcase_02
Case #4	: Accepted	00:04	24228	56	53	testcase_03
Case #5	: Accepted	00:03	24468	147	144	testcase_04
Case #6	: Accepted	00:03	24172	291	287	testcase_05
Case #7	: Accepted	00:04	24232	576	572	testcase_06
Case #8	: Accepted	00:06	26868	28990	28984	testcase_07
Case #9	: Accepted	00:63	156056	9728633	9728625	testcase_08
Case #10	: Accepted	00:40	94092	7778162	7778154	testcase_09

< prev |		/		| next >	 		
 
Judge Input #  ( | )		Judge Output #  ( | )

