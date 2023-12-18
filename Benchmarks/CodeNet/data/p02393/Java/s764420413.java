import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String[] num2 = num1.split(" ");

        int a = Integer.parseInt(num2[0]);
        int b = Integer.parseInt(num2[1]);
        int c = Integer.parseInt(num2[2]);

        int tmp = 0;

        if(a > b){
            tmp = a;
            a = b;
            b = tmp;
        }if(b > c){
            tmp = b;
            b = c;
            c = tmp;
        }if (a > b) {
            tmp = a;
            a = b;
            b = tmp;
        }
    }
}