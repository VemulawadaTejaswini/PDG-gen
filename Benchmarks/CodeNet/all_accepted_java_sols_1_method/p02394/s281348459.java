import java.io.*;
  
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] cut = input.split(" ");
        int width = Integer.parseInt(cut[0]);
        int height = Integer.parseInt(cut[1]);
        int x = Integer.parseInt(cut[2]);
        int y = Integer.parseInt(cut[3]);
        int r = Integer.parseInt(cut[4]);
         
         
        if(x + r <= width && y + r <= height && x - r >= 0 && y - r >= 0)
            System.out.println("Yes");
        else
            System.out.println("No");    
    }
}
