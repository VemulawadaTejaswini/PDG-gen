import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String target = br.readLine().toLowerCase();
        String str;
        String[] strArr;
        int count = 0;
        int i;
        while (!(str = br.readLine()).equals("END_OF_TEXT")) {
            strArr = str.toLowerCase().split(" ");
            for (i = 0; i < strArr.length; i++) {
                if (strArr[i].equals(target)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}