import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double result = 10;

        for(int i=0; i<n; i++){
            result *= 1.05;
        }
        int result1 = (int)Math.ceil(result)*10000;
        System.out.println(result1);

    }
}