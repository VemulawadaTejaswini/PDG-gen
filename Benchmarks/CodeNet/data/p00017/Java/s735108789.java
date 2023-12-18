
import java.util.Scanner;

public class Main{
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            String s1 = "the";
            String s2 = "this";
            String s3 = "that";
            if (s.equals("EOF")) {
                break;
            } else {
                String out = "";
                for (int j=1; j < 26; j++){
                    String es ="";
                    for (int i=0; i < s.length(); i++){
                        char o = (char)(s.charAt(i));
                        if (o != '.' && o != ' '){
                            out = out + o;

                        }
                        else {
                            out = out + o;
                            String outText = cipher(out, j);
                            out = "";
                            es = es + outText;

                        }

                    }
                    if (es.contains(s1) || es.contains(s2) || es.contains(s3)) {
                        System.out.println(es);
                    }

                }
            }
        }
    }

    public static String cipher (String word, int key){
        String s = "";
        int len = word.length();
        for(int x = 0; x < len; x++){
            if ((char)(word.charAt(x)) != '.' && (char)(word.charAt(x)) != ' ') {
                char c = (char)(word.charAt(x) + key);
                if (c > 'z')
                    s += (char)(word.charAt(x) - (26-key));
                else
                    s += (char)(word.charAt(x) + key);
            }
            else {
                s += (char)(word.charAt(x));
            }

        }
        return s;
    }


}