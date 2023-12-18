import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String IDENTICAL = "IDENTICAL";
    public static String CLOSE = "CLOSE";
    public static String DIFFERENT = "DIFFERENT";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i = 0;
        String c1 = "";
        String c2 = "";
        while (true) {
            String line = sc.nextLine();
            if (line.equals(".")) {
                return;
            }

            if (i % 2 == 0) {
                c1 = line;
            } else {
                c2 = line;
                System.out.println(process(c1, c2));
            }
            i++;
        }

    }


    public static String process(String c1, String c2) {
        if (c1.equals(c2)) {
            return IDENTICAL;
        }
        String regex = "\\\"(.*?)\\\"";

        String removeCommand1 = c1.replaceAll(regex, "");
        String removeCommand2 = c2.replaceAll(regex, "");
        if(!removeCommand1.equals(removeCommand2)) {
            return DIFFERENT;
        } else {
            String [] arrC1 = c1.split(regex);
            String [] arrC2 = c2.split(regex);

            for (int i = 0; i < arrC1.length && i < arrC2.length; i++) {
                if(!arrC1[i].equals(arrC2[i])){
                    return DIFFERENT;
                }
            }
        }

        Pattern p = Pattern.compile(regex);
        Matcher m1 = p.matcher(c1);
        Matcher m2 = p.matcher(c2);
        ArrayList<String> arrCommand1 = new ArrayList<>();
        while(m1.find()) {
            arrCommand1.add(m1.group(1));
        }

        ArrayList<String> arrCommand2 = new ArrayList<>();
        while(m2.find()) {
            arrCommand2.add(m2.group(1));
        }

        int countCommandDiff = 0;
        if(arrCommand2.size() != arrCommand1.size()){
            return DIFFERENT;
        }
        for (int i = 0; i < arrCommand1.size() && i < arrCommand2.size(); i++) {
            if(!arrCommand1.get(i).equals(arrCommand2.get(i))) {
                countCommandDiff ++;
            }
        }

        if(countCommandDiff < 2) {
            return CLOSE;
        }

        return DIFFERENT;
    }
}
