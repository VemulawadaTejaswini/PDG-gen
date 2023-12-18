import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] line;
        String a, b;
        int scoreOfA = 0;
        int scoreOfB = 0;

        for(int i = 0; i < n; i++){
            line = br.readLine().split(" ");
            a = line[0];
            b = line[1];

            if(a.compareTo(b) > 0){
                scoreOfA += 3;
            }else if(a.compareTo(b) < 0){
                scoreOfB += 3;
            }else{
                scoreOfA++;
                scoreOfB++;
            }
        }
        System.out.println(scoreOfA + " " + scoreOfB);
    }
}