import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String p = br.readLine();
        boolean check = false;
        label:for(int i=0;i<s.length();i++){
            if(s.charAt(i)==p.charAt(0)){
                for(int j=1;j<p.length();j++){
                    if(s.charAt((i+j)%s.length())!=p.charAt(j)) continue label;
                }
                check = true;
            }
        }
        if(check){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}