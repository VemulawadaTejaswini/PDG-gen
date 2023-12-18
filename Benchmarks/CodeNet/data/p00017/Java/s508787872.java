import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        try {
            char c;
            char[] dict = new char[26];
            //Pattern p =
            for (int i = 0; i < 26; i++) {
                dict[i] = (char)((int)'a' + i);
            }
            String line = br.readLine();
            int offset = 0;
            while (offset<26) {
                  for (int i = 0; i < line.length(); i++) {
                    c = line.charAt(i);
                    switch(c){
                        case ' ' :
                            break;
                        case '\n' :
                            break;
                        case '.' :
                            break;
                        default:
                            c = dict[((int)c - 97 + offset)%26];
                    }
                    sb.append(c);

                }

                if(sb.toString().indexOf("this") >= 0
                        || sb.toString().indexOf("the") >= 0
                        || sb.toString().indexOf("that") >= 0) {
                    break;
                }
                sb.delete(0, sb.toString().length());
                offset++;
            }
            System.out.println(sb.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}