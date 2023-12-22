import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char[] c = str.toCharArray();
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(c[i])){
                c[i] = Character.toLowerCase(str.charAt(i));
            }else if(Character.isLowerCase(c[i])){
                c[i] = Character.toUpperCase(str.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(char letter: c){
            sb.append(letter);
        }
        System.out.println(sb);
    }
}
