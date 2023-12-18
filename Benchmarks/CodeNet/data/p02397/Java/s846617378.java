import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder=new StringBuilder();
        while(true){
            String data[]=reader.readLine().split(" ");
            int x=Integer.parseInt(data[0]);
            int y=Integer.parseInt(data[1]);
            if(x==0 && y==0) break;
            builder.append(Integer.toString(x<y?x:y)).append(" ").append(Integer.toString(x<y?y:x)).append("\n");
        }
        System.out.print(builder);
    }
}