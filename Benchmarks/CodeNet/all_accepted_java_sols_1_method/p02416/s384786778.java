import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        do{
        String line = reader.readLine();
        for(int i = 0;i < line.length();i++){


        char c = line.charAt(i);
        int a = 0;
        a = c - '0';
        sum = sum + a;

            if(sum != 0 && i == line.length() - 1){
                System.out.println(sum);
            }
            if(sum == 0){
                break;
            }

        }
            if(sum == 0){
                break;
            }
            sum = 0;
        }while(true);

    }
}

