import java.io.*;

public class Main{
   public static void main(String[] args)throws IOException
   {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        
        while(true){
           int num = Integer.parseInt(br.readLine());
           if(num == 0){
              break;
           }
           sb.append("Case").append(i).append(": ").append(num).append("\n");
           i++;
        }
        
        System.out.println(sb);
    }
}