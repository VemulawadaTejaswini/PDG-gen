import java.io.*;

class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strarr = str.split(" ");
        
        int W = Integer.parseInt(strarr[0]);
        int H = Integer.parseInt(strarr[1]);
        int x = Integer.parseInt(strarr[2]);
        int y = Integer.parseInt(strarr[3]);
        int r = Integer.parseInt(strarr[4]);
        
        if((x - r < 0) || (x + r > W) || (y - r < 0) || (y + r > H)) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
    
}
