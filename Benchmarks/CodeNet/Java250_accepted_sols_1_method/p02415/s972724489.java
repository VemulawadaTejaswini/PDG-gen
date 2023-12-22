import java.io.*;
 
class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder res = new StringBuilder();
        String line = br.readLine();
        int len = line.length();
        for(int i=0; i<len; i++) {
            char ch = line.charAt(i);
            if(Character.isLowerCase(ch)) res.append(Character.toUpperCase(ch));
            else if(Character.isUpperCase(ch)) res.append(Character.toLowerCase(ch));
            else res.append(ch);
        }
        System.out.println(res);
    }
}