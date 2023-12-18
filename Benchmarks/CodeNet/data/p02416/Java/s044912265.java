import java.io.*;

class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        int sum = 0;

        while(true){
            str = br.readLine();

            if(str.equals("0"))break;
            
            int n = Integer.parseInt(str);

            for(int i=3; i>=0; i--){
                sum += n % 10;
                n /= 10;
            }
            System.out.println(sum);
            sum = 0;
        }
    }
}