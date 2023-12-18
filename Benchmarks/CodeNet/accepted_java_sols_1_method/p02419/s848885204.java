import java.io.*;

public class Main{
    public static void main(String[]args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String W = br.readLine().toLowerCase();
        int cnt = 0;

        while(true){
            String[] T = br.readLine().split(" ");
            if(T[0].equals("END_OF_TEXT")){
                break;
            }

            for(int i = 0; i < T.length; i++){
                if(T[i].toLowerCase().equals(W)){
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}