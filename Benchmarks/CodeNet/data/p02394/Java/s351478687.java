import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strArr = br.readLine().split(" ");
        int w = Integer.parseInt(strArr[0]);
        int h = Integer.parseInt(strArr[1]);
        int x = Integer.parseInt(strArr[2]);
        int y = Integer.parseInt(strArr[3]);
        int r = Integer.parseInt(strArr[4]);

        if ( (x - r < 0 || x + r > w) || (y - r < 0 || y + r > h) ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}