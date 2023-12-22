import java.io.BufferedReader;
import java.io.InputStreamReader;


class Main {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static String S, T;
    static int result = 0;

    public static void main(String[] args) throws Exception {
        S = br.readLine();
        T = br.readLine();
        
        for(int i = 0; i < S.length(); i++){
           if(S.charAt(i) != T.charAt(i)){
                result++;
           }
        }
        System.out.println(result);
    }

}