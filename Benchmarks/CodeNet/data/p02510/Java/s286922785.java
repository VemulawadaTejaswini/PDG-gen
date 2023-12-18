import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader stdReader = new BufferedReader(new InputStreamReader(System.in));
            ArrayList<String> ans = new ArrayList<String>();
            String line = null;
            String st = "";
            while (true) {
                line = stdReader.readLine();
                if (line.equals("-")) {
                    ans.add(st);
                    break;
                } else {
                    try {
                        int cutpoint = Integer.parseInt(line);
                        if (cutpoint < 200) {
                            char[] ca = st.toCharArray();
                            st = "";
                            for (int i = cutpoint; i < ca.length; i++) {
                                st += ca[i];
                            }
                            for (int i = 0; i < cutpoint; i++) {
                                st += ca[i];
                            }
                        }
                    } catch(NumberFormatException e) {
                        if (st != null) {
                            ans.add(st);
                        }
                        st = new String(line);
                    }
                }
            }
            for (int i = 1; i < ans.size(); i++) {
                System.out.println(ans.get(i));
            }
        } catch (Exception e) {
            System.out.println(e);
            e.getStackTrace();
            System.exit(-1);
        }
    }
}