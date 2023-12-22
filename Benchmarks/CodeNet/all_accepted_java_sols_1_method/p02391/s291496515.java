import java.io.*;
 
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] cut = input.split(" ");
        int noOne = Integer.parseInt(cut[0]);
        int noTwo = Integer.parseInt(cut[1]);
        
        if(noOne < noTwo) {
            System.out.println("a < b");
        }else if(noOne > noTwo) {
            System.out.println("a > b");
        }else {
            System.out.println("a == b");
        }
    }
}