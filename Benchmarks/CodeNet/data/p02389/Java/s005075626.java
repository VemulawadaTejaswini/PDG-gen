import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String[] num2 = num1.split(""); 

        int x = Integer.parseInt(num2[0]);
        int y = Integer.parseInt(num2[1]);

        int area = x * y;
        int length = 2 * (x + y);

        System.out.println(area + "" + length);
    }
}