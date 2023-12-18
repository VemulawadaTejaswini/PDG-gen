import java.io.*;
import static java.lang.Integer.parseInt;

public class Main {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str;
        int i = 0;
        while((str = br.readLine())!=null&&i<200){
            String[] num = str.split(" ",0);
            int x = parseInt(num[0]);
            int y = parseInt(num[1]);
            if(0<=x&&x<=1000000&&0<=y&&y<=1000000){
            int z = x+y;
            System.out.println(Integer.toString(z).length());
            }
            i++;
        }
    }
}