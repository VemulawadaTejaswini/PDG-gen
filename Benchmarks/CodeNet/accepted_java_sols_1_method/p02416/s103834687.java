import java.io.*;
public class Main {
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader((System.in)));
        try{
            while(true) {
                String line = reader.readLine();
                if(line.equals("0")) break;
                int sum = 0;
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    sum += c - '0';
                }
                System.out.println(sum);
            }
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}

