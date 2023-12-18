import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;

public class Main{

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        ArrayDeque<String> dict = new ArrayDeque<String>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < n; i++){
            String[] in = br.readLine().split(" ");
            if(in[0].equals("insert")){
                dict.add(in[1]);
            }else{
                if(dict.contains(in[1])) sb.append("yes\n");
                else sb.append("no\n");
            }
        }
        System.out.print(sb);
    }

}