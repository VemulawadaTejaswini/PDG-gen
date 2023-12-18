import java.io.*;
public class Main {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int i,sum=0;
            try {
                String line = reader.readLine();
                if(line.equals("0")) break;
                for(i=0;i<line.length();i++) {
                    char c = line.charAt(i);
                    sum += Character.getNumericValue(c);
                }
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println(sum);
        }


    }
}

