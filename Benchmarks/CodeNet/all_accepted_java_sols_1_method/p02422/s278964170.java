import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader in = new BufferedReader(new InputStreamReader(System.in))){
            String s = in.readLine();
            int n = Integer.parseInt(in.readLine());
            for (int i = 0; i < n; i++) {
                String[] arr = in.readLine().split(" ");
                switch (arr[0]) {
                    case "print":
                        System.out.println(s.substring(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]) + 1));
                        break;
                    case "reverse":
                        int p1 = Integer.parseInt(arr[1]);
                        int p2 = Integer.parseInt(arr[2]);
                        String subs = s.substring(p1, p2 + 1);
                        String reversed = new StringBuilder(subs).reverse().toString();
                        s = s.substring(0, p1) + reversed + s.substring(p2 + 1);
                        break;
                    case "replace":
                        char[] rearr = s.toCharArray();
                        int b = Integer.parseInt(arr[1]);
                        int e = Integer.parseInt(arr[2]);
                        String text = arr[3];
                        for (int j = 0; j < text.length(); j++) {
                            rearr[j + b] = text.charAt(j);
                        }
                        s = String.valueOf(rearr);
                        break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

