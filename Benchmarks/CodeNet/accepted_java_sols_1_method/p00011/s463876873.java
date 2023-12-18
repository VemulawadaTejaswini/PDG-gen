import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int w = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<String>();
        for (int j=0; j<w; j++){
            list.add(String.valueOf(j+1));
        }
        for (int i=0; i<n; i++){
            String[] yoko = br.readLine().split(",");
            int ai = Integer.parseInt(yoko[0]);
            int bi = Integer.parseInt(yoko[1]);
            StringBuilder sb = new StringBuilder();
            sb.append(list.get(ai-1));
            list.set(ai-1, list.get(bi-1));
            list.set(bi-1, sb.toString());
        }
        for (int k=0; k<list.size(); k++){
            System.out.println(list.get(k));
        }
    }
}