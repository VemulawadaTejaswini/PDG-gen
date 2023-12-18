import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextLine()) {
            String s = scan.nextLine();
            String s1 = "the";
            String s2 = "this";
            String s3 = "that";
            for (int j=1; j < 26; j++){
                int shift = j % 26 + 26;
                String es = "";
                for (int i=0; i < s.length(); i++){
                    char c = s.charAt(i);
                    //System.out.println(c);

                    if (Character.isLetter(c)){
                        es = es + (char)('a' + (c - 'a' + shift) % 26);


                    }
                    else {
                        es = es + c;

                    }


                }
                if (es.contains(s1) || es.contains(s2) || es.contains(s3)) {
                    System.out.println(es);
                }


                }

        }
    }



}