import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        StringBuilder sb = new StringBuilder();
        char[] charArr;
        char c;
        int count;
        while ((str = br.readLine()) != null) {
            try {
                sb.append(str.toCharArray());
            } catch (Exception e) {
                break;
            }
            
        }
        charArr = sb.toString().toCharArray();
        for (c = 'a'; c <= 'z'; c++) {
            count = 0;
            for (char x : charArr) {
                if (x == c || x == Character.toUpperCase(c)) {
                    count++;
                }
            }
            System.out.println(c + " : " + count);
        }
    }
}