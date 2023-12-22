import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.PrintWriter;

class Main {
    public static void main(String[] args){
        try {

        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        String str[] = (br.readLine()).split("\\s+");
        int A = Integer.parseInt(str[0]);
        int P = Integer.parseInt(str[1]);
        PrintWriter pw = new PrintWriter(System.out);

        pw.print((P+3*A)/2);
        pw.flush();

        } catch(IOException e) {
            System.out.println("Exception :" + e);
        }

    }
}