import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String input[] = new String[2];
            HashSet<String> map = new HashSet<String>();
            int N = Integer.parseInt(br.readLine());
            StringBuilder ans = new StringBuilder();
            for(int i = 0; i < N; i++){
            	input = br.readLine().split("\\s+");
                if("insert".equals(input[0])) {
                	map.add(input[1]);
                } else {
                	if (map.contains(input[1])) {
                		ans.append("yes\n");
                	} else {
                		ans.append("no\n");
                	}
                }
            }
            System.out.print(ans.toString());
    }
}
