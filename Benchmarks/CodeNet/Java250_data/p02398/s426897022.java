import java.io.*;

class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            String[] line = reader.readLine().split(" ");
            int a = Integer.parseInt(line[0]);
            int b = Integer.parseInt(line[1]);
            int c = Integer.parseInt(line[2]);
           
            int count = 0;
            for (int i = 1; i <= c; i++) {
                if (c % i == 0) {
                    int tmp = c / i;
                    
                    if (a <= tmp && tmp <= b) {
                        count++;
                    }
                }
            }

            System.out.println(count);
            
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}