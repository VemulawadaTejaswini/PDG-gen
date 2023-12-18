import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = null;
        PrintWriter writer = null;
        
        try {
            br =new BufferedReader(new InputStreamReader(System.in));
            writer = new PrintWriter(System.out);
            
            String[] readLine = br.readLine().split(" ");
            int firstNum = Integer.parseInt(readLine[0]),
                secondNum = Integer.parseInt(readLine[1]);
            
            if(firstNum%secondNum != 0){
                for(int i = firstNum * 2; i < Math.pow(10, 18); i += firstNum){
                    if(i % secondNum != 0){
                        writer.println(i);
                        break;
                    }
                }
            }else writer.println(-1);
            
        }finally{
            if(br != null){
                br.close();
            }
            if(writer != null){
                writer.close();
            }
        }

    }
}