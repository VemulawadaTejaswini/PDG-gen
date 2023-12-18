import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            int N = Integer.parseInt(line); 
            if(N<=1 || 100<=N){
                System.out.println("Number is not collect");
            }else{
                System.out.println(N*N*N);
            }
            }catch(IOException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println("Number is not collect");
        }
    }
}
