import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{
    public static void main(String[] args){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String[] s = br.readLine().split(" ");
            if(s[0].charAt(s[0].length() - 1) == s[1].charAt(0) && s[1].charAt(s[1].length() - 1) == s[2].charAt(0))
                System.out.println("YES");
            else
                System.out.println("NO");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
