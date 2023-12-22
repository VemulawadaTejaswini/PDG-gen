import java.io.*;

public class Main{
    public static void main(String[] args){
        int n = 0;
        String line;
        int i = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            line = reader.readLine();
            n = Integer.parseInt(line);
            int[] number;
            number = new int[100];
            line = reader.readLine();
            String[] data = line.split(" ",n);
            for(i = n-1; i >= 0; i--){
                if(i == 0){
                    System.out.println(data[i]);
                    break;
                }
                System.out.print(data[i] + " ");
            }

            
        } catch (NumberFormatException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
