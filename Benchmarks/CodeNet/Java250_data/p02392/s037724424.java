import java.io.*;

class Main{ 
public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[ ] str_div = br.readLine().split(" ");
        int x = Integer.parseInt(str_div[0]);
        int y = Integer.parseInt(str_div[1]);
        int z = Integer.parseInt(str_div[2]);
        if(x < y && y< z )
        System.out.println("Yes");
        else
        System.out.println("No");
 }
}
     