import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().aplit(" ");

        int x = Integer.parseInt(num[0]);
        int y = Integer.parseInt(num[1]);

        int area = x * y;
        int length = (x + y) * 2;

        System.out.println(area + " " + length);
    }
}