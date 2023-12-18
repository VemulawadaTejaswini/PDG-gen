import java.io.*;

class Main{
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num1 = br.readLine();
        String[] num2 = num1.split(" ");

        int a = Integer.parseInt(num2[0]);
        int b = Integer.parseInt(num2[1]);
        int c = Integer.parseInt(num2[2]);

        for(int i=a; i<=b; i++){
            if(c % i == 0){
                int count++;
            }
        }

        System.out.println(count);
    }
}