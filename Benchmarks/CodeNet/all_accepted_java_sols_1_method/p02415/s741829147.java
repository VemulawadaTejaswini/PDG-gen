import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String ans = "";

        for(int i = 0; i < line.length(); i++){
            String str = line.substring(i, i+1);
            if(str.equals(str.toUpperCase())){
                ans += str.toLowerCase();
            }else{
                ans += str.toUpperCase();
            }
        }
        System.out.println(ans);
    }
}