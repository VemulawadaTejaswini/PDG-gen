import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;
        StringTokenizer st;
        try {
            while (true) {
                String line;
                sb = new StringBuilder();
                Map<String,String> convTable = new HashMap<>();
                int convTableNum = Integer.parseInt(br.readLine().trim());
                if(convTableNum==0){
                    break;
                }
                for (int i = 0; i < convTableNum ; i++) {
                    line = br.readLine();
                    st = new StringTokenizer(line);
                    convTable.put(st.nextToken(),st.nextToken());
                }
                int dataNum = Integer.parseInt(br.readLine().trim());
                for (int i = 0; i < dataNum ; i++) {
                    line = br.readLine().trim();
                    for (Map.Entry<String, String> entry : convTable.entrySet()) {
                        if(entry.getKey().equals(line)){
                            line = entry.getValue();
                            break;
                        }
                    }
                    sb.append(line);
                }
                System.out.println(sb.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}