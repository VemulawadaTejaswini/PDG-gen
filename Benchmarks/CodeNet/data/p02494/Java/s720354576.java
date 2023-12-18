import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[] length = in.readLine().split(" ");
        String[] breakflag = {"0", "0"};
        StringBuffer sb = new StringBuffer();
        while(Arrays.deepEquals(length, breakflag) == false){
            for(int i=0; i<Integer.parseInt(length[0]); i++){
                for(int j=0; j<Integer.parseInt(length[1]); j++){
                    sb.append("#");
                }
                sb.append("\n");
            }
            sb.append("\n");
            length=in.readLine().split(" ");
        }

        System.out.print(sb);
        in.close();
    }
}