import java.io.*;
import java.util.*;
 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
 
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> boxes = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            boxes.add(Integer.parseInt(st.nextToken()));
        }
 
        Collections.swap(boxes,0, 1);
        Collections.swap(boxes,0, 2);
 
        pw.println(boxes.get(0) + " " + boxes.get(1) + " " + boxes.get(2));
 
        pw.close();
 
    }
}