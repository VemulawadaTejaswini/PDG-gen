import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        int i;
        int sum;
        while (true) {
            str = br.readLine();
            if (str.equals("0")) break;
            sum = 0;
            for (i = 0; i < str.length(); i++) {
                sum += Character.getNumericValue(str.charAt(i));
            }
            System.out.println(sum);
        }
    }
}