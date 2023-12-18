import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args){
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
            try{
            int m=Integer.parseInt(reader.readLine());
            String line=reader.readLine();
            String li="...";
            if(m<line.length()){
                line=line.substring(0, m)+li;
            }
            System.out.println(line);
        }catch (IOException e){    
        }
    }
}