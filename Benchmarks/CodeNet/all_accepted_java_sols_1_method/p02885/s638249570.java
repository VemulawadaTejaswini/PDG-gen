import java.io.*;
public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String lineF = br.readLine();
            String []line = lineF.split(" ");
            int A = Integer.parseInt(line[0]);
            int B = Integer.parseInt(line[1]);
            int Ans  = A - 2*B;
            if(Ans >= 0){
                System.out.println(Ans);
            }else{
                System.out.println(0);
            }
        }catch(IOException e){
            e.printStackTrace();    
        }
    }
}