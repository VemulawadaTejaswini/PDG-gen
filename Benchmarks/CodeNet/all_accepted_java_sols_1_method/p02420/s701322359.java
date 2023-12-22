import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int n, h;

        while(true){
            str = br.readLine();
            if(str.equals("-")){
                break;
            }
            n = Integer.parseInt(br.readLine());

            for(int i = 0; i < n; i++){
                h = Integer.parseInt(br.readLine());
                StringBuilder sb = new StringBuilder();
                sb.append(str.substring(h, str.length())).append(str.substring(0, h));
                str = sb.toString();
            }
            System.out.println(str);
        }
    }
}