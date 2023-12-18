import java.awt.*;
import java.awt.geom.*;
import java.io.*;
 
import java.util.*;
class Main {
 
    static char[] xx = new char[] {'S','H','C','D'};
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            if(n == 0 && x == 0) break;
            int count = 0;
            for (int i = 1; i <= n; i++) {
                for (int j = i + 1; j <= n; j++) {
                    for (int k = j + 1; k <= n; k++) {
                        if (i + j + k == x) {
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }
 
    }
}

Compile Error Logs:

ステータス
Judge: 4/4	JAVA	CPU: 00:07 sec	Memory: 19652 KB	Length: 565 B	2015-07-11 14:37
テストケースの判定結果
Case #	Verdict	CPU Time	Memory	In	Out	Case Name
Case #1	: Accepted	00:05	17164	8	2	testcase_00
Case #2	: Accepted	00:06	18872	28	10	testcase_01
Case #3	: Accepted	00:05	17236	85	36	testcase_02
Case #4	: Accepted	00:07	19652	297	163	testcase_03

< prev |		/		| next >	 		
 
Judge Input #  ( | )		Judge Output #  ( | )

