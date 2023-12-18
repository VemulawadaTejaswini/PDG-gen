import java.io.*;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String buf;
        double weight;
        String cup ="A";
        while((buf = br.readLine())!=null){
            String[] str=buf.split(",");
            if(cup.equals(str[0])){
                cup = str[1];
            }else if(cup.equals(str[1])){
                cup = str[0];
            }
        }
        System.out.println(cup);
    }
}