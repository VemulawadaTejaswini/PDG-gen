import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        double result = 100000;

        for(int i=0; i<n; i++){
            result *= 1.05;
            result = Math.ceil(result/1000)*1000;
        }
        System.out.println((int)result);

    }
}