import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            char c;
            String line = br.readLine();
            for (int i = 0; i < line.length(); i++) {
                c = line.charAt(i);
                switch(c){
                    case 'a' :
                        c = 'w';
                        break;
                    case 'b' :
                        c = 'x';
                        break;
                    case 'c' :
                        c = 'y';
                        break;
                    case 'd' :
                        c = 'z';
                        break;
                    case ' ' :
                        break;
                    case '\n' :
                        break;
                    case '.' :
                        break;
                    default:
                        c = (char)((int)c - 4);
                }
                sb.append(c);
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}