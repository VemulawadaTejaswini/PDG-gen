import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String[] num2 = num1.split(" ");

        int W = Integer.parseInt(num2[0]);
        int H = Integer.parseInt(num2[1]);
        int x = Integer.parseInt(num2[2]);
        int y = Integer.parseInt(num2[3]);
        int r = Integer.parseInt(num2[4]);

        if(x - r < 0 || y - r < 0){
            System.out.println("No");
        }else if(x + r > W || y + r > H){
            System.out.println("No");
        }else {
            System.out.println("Yes");
        }

    }
}