import java.io.*;
 
class Main{ 
public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[ ] str_div = br.readLine().split(" ");

        int w = Integer.parseInt(str_div[0]);
        int h = Integer.parseInt(str_div[1]);
        int x = Integer.parseInt(str_div[2]);
        int y = Integer.parseInt(str_div[3]);
        int r = Integer.parseInt(str_div[4]);



        if((x - r >= 0) && (x + r <= w) && (y - r >= 0) && (y + r <= h))
        System.out.println("Yes");
        else
        System.out.println("No");
 }
}
   