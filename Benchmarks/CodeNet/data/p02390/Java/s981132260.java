import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
                int S, h, m, s;

                String line = reader.readLine();
                S = Integer.parseInt(line);
                h = S / 3600;
                m = (S % 3600) / 60;
                s = ((S % 60));
                System.out.print(h);
                System.out.print(":" + m);
                System.out.print(":" + s);
                System.out.println(); 

        } catch (IOException e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}