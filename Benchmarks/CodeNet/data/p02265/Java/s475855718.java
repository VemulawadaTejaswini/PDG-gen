import java.io.*;
import java.util.LinkedList;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        LinkedList<String> list = new LinkedList<String>();
        String[] input;

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");

            if (input[0].equals("insert")) {
                list.addFirst(input[1]);
            } else if (input[0].equals("delete")) {
                list.remove(input[1]);
            } else if (input[0].equals("deleteFirst")) {
                list.removeFirst();
            } else {
                list.removeLast();
            }
        }

        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb.toString());
    }
}