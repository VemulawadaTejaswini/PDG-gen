import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        String p = br.readLine();
        int cnt = 0;

        for(int i = 0; i < s.length(); i++){
            cnt = 0;
            for(int j = 0; j < p.length(); j++){
                if(s.charAt((i+j) % s.length()) == p.charAt(j)){
                    cnt++;
                }else{
                    break;
                }
            }
            if(cnt == p.length()){
                break;
            }
        }
        if(cnt == p.length()){
            System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    }
}