import java.io.*;
 
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] cut = input.split(" ");
        int noOne = Integer.parseInt(cut[0]);
        int noTwo = Integer.parseInt(cut[1]);
        int noThree = Integer.parseInt(cut[2]);
        
        if(noOne < noTwo && noTwo < noThree) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}