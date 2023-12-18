import java.io.*;

class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = 0;
        int f = 0;
        int r = 0;        
        
        while(true) {
            String str[] = br.readLine().split(" ");
            m = Integer.parseInt(str[0]);
            f = Integer.parseInt(str[1]);
            r = Integer.parseInt(str[2]);

            if (m == -1 && f == -1 && r == -1) {
                break;
            }
            if (m == -1 || f == -1)
                System.out.println("F");
            else if (m + f >= 80)
                System.out.println("A");
            else if (m + f >= 65)
                System.out.println("B");
            else if (m + f >= 50)
                System.out.println("C");
            else if (m + f >= 30) {
                if (r >= 50)
                    System.out.println("C");
                else
                    System.out.println("D");
            } else
                System.out.println("F");
        }
    }
}