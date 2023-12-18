import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String capitalizedStr = Character.toTitleCase(str.charAt(0)) + str.substring(1).toLowerCase();
        System.out.println(capitalizedStr);
    }
}
