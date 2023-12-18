import java.io.*;

public class Main{
	public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int ans = 0;
        try {
            String W = reader.readLine();
            while(true){
                String t = reader.readLine();
                String T = t + ' ';

                if(t.equals("END_OF_TEXT")) break;

                for(int i = 0; i < T.length() - W.length(); i++){

                    String S = T.substring(i, i + W.length());
                    if(S.equalsIgnoreCase(W)&Character.isWhitespace(T.charAt(i+W.length()))){
                        if(i - 1 >= 0){
                            if(!Character.isWhitespace(T.charAt(i-1))) continue;
                        }
                        ans++;
                    }
                }
            } 
        }catch (IOException e){
            System.out.println(e);
        }

        System.out.println(ans);
    }
}
