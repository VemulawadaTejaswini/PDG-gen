import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{

    public static void main(String[] args)  throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //int t = Integer.parseInt(reader.readLine());

        String s = reader.readLine();
        String[] inp = s.split(" ");

        int a = Integer.parseInt(inp[0]);
        int b = Integer.parseInt(inp[1]);
        int c = Integer.parseInt(inp[2]);

        int tr = a-b;

        int x = tr-c;

        if(x>=0)
        {
            System.out.println("0");
        }
        else
        {
            System.out.println(c-tr);
        }
    }
}
