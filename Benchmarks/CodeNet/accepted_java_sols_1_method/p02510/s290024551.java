import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str, newstr;
        int shuffle, h_i;
        
        while (true) {
            shuffle = 0;
            str = in.readLine();
            
            if (str.equals("-"))
                break;
            
            shuffle = Integer.parseInt(in.readLine());
            for (int i=0; i<shuffle; i++) {
                h_i = Integer.parseInt(in.readLine());
                newstr = str.substring(h_i, str.length())
                    + str.substring(0, h_i);
                str = newstr;
            }
            System.out.println(str);
        }
	}
}