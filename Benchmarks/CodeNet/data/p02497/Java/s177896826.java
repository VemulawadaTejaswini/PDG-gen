import java.io.*;
import java.util.Scanner;

class Main {
	public static void main (String[] args) throws IOException{
		Scanner in = new Scanner(System.in);
		
		while (true) {
            int m = Integer.parseInt(in.next());
            int f = Integer.parseInt(in.next());
            int r = Integer.parseInt(in.next());
            int sum = m + f;   // 中間＋期末
            
            if (m == -1 && f == -1 && r == -1)
                break;
            
            if ((m == -1) || (f == -1)) {
                // 中間、期末のいずれかを欠席
                System.out.println("F");
            } else if (sum >= 80) {
                // sum>=80
                System.out.println("A");
            } else if (65 <= sum && sum < 80) {
                // 65<=sum<80
                System.out.println("B");
            } else if (50 <= sum && sum < 65) {
                System.out.println("C");
            } else if (30 <= sum && sum < 50) {
                if (r > 50)
                    System.out.println("C");
                else
                    System.out.println("D");
            } else {
                System.out.println("F");
            }
		}
	}
}