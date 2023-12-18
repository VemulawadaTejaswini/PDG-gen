// 中間試験、期末試験のいずれかを欠席した場合成績は F。
// 中間試験と期末試験の合計点数が 80 以上ならば成績は A 。
// 中間試験と期末試験の合計点数が 65 以上 80 未満ならば成績は B。
// 中間試験と期末試験の合計点数が 50 以上 65 未満ならば成績は C。
// 中間試験と期末試験の合計点数が 30 以上 50 未満ならば成績は D。 ただし、再試験の点数が 50 以上ならば成績は C。
// 中間試験と期末試験の合計点数が 30 未満ならば成績は F。

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            while(true) {
                String[] arr = br.readLine().split(" ");
                int m = Integer.parseInt(arr[0]), f = Integer.parseInt(arr[1]), r = Integer.parseInt(arr[2]);
                if(m==-1 && f==-1 && r==-1){
                    break;
                }
                int total = m+f;
                if ((m==-1 || f==-1) || total<30) {
                    System.out.println("F");
                } else if (total>=80) {
                    System.out.println("A");
                } else if (total>=65 && total<80) {
                    System.out.println("B");
                } else if (total>=50 && total<65) {
                    System.out.println("C");
                } else if (total>=30 && total<50) {
                    if(r>=50) {
                        System.out.println("C");
                    } else {
                        System.out.println("D");
                    }
                }
            }
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

