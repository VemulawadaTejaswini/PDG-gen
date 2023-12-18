import java.io.*;


public class Main  {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        char[] a = br.readLine().toCharArray();

        int b = a[0];
        if(b <= 122 && b >= 97) System.out.println("a");
        else if(b <= 90 && b >= 65) System.out.println("A");
        // 97 122 lower case
            //65 90
       
    }


}

