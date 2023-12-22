import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str = "";


        for (int i = 1; i < (n + 1); i++) {
            String s = Integer.toString(i);
            if((i%3)==0 || s.contains("3")){
                str = str + " " + s;
            }


        }

        System.out.println(str);

        scn.close();

    }
}

