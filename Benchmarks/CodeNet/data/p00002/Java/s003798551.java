import static java.lang.Integer.parseInt;
import java.io.*;

class Main{
    public static void main(String[] a) throws IOException{

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String s;

        while((s = input.readLine())!=null){
            String[] num = s.split(" ",0);
            int x = parseInt(num[0]);
            int y = parseInt(num[1]);
            if(0 <= x && x <=1000000 && 0 <= y && y <= 1000000){
                int z = x + y;
                System.out.println(Integer.toString(z).length());
            }
        }
    }
}