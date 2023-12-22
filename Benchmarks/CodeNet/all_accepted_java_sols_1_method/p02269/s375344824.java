import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        HashSet<String> dict = new HashSet<>();
        try {
            String line;
            String arg;
            int n = Integer.parseInt(br.readLine());
            for (int i = 0; i < n; i++) {
                line = br.readLine();
                st = new StringTokenizer(line);
                String cmd = st.nextToken();
                if (cmd.equals("insert")) {
                    arg = st.nextToken();
                    dict.add(arg);
                } else if (cmd.equals("find")) {
                    arg = st.nextToken();
                    if(dict.contains(arg)){
                        System.out.println("yes");
                    }else{
                        System.out.println("no");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}