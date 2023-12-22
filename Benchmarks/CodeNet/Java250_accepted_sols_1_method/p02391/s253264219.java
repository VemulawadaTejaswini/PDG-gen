import java.io.*;

class Main{ 
public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] div = str.split(" ");
        int x = Integer.parseInt(div[0]);
        int y = Integer.parseInt(div[1]);
            if(x < y)
                System.out.println("a < b");
            else if(x > y)
                System.out.println("a > b");
            else if(x == y)
                System.out.println("a == b");
 }
}
      