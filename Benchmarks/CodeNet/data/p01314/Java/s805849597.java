
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class Main {
 
    static int count = 0;
    static int input = 0;
 
    public static int sum(int x, int y) {
        return (x + y) * (y - x + 1) / 2;
    }
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        while (true) {
            input=0;
            count=0;
            String num = br.readLine();
            if (num.equals("0")) {
                return;
            }
 
            input = Integer.parseInt(num);
 
            for (int i = 1; i < input; i++) {
                for (int j = i+1; j < input; j++) {
                    if (input == sum(i, j)) {
                        count++;
                        break;
                    }
                    if (input < sum(i, j)) {
                        break;
                    }
                }
            }
            System.out.println(count);
        }
    }
 
}
