import java.io.*;
 
public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] cut = input.split(" ");
        int noOne = Integer.parseInt(cut[0]);
        int noTwo = Integer.parseInt(cut[1]);
        int noThree = Integer.parseInt(cut[2]);
        
        
        if(noOne > noTwo || noTwo > noThree) {
            if(noOne > noTwo){
                int temp = noOne;
                noOne = noTwo;
                noTwo = temp;
            }
            if(noTwo > noThree){
                int temp = noTwo;
                noTwo = noThree;
                noThree = temp;
            }
            if(noOne > noTwo){
                int temp = noOne;
                noOne = noTwo;
                noTwo = temp;
            }
        }
        System.out.println(noOne + " " + noTwo + " " + noThree);
        
    }
}
