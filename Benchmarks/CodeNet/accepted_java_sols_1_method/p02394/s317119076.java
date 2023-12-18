import java.io.*;

class Main {

    public static void main(String[] args) {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        
        try {

            String[] line = reader.readLine().split(" ");

            int W = Integer.parseInt(line[0]);
            int H = Integer.parseInt(line[1]);
            int x = Integer.parseInt(line[2]);
            int y = Integer.parseInt(line[3]);
            int r = Integer.parseInt(line[4]);
            
            boolean flag_width  = (x + r >= 0) && (x + r <= W);
            boolean flag_height = (y + r >= 0) && (y + r <= H);
            
            if (x < 0 || y < 0) { 
                System.out.println("No");
            } else if (flag_width && flag_height) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}