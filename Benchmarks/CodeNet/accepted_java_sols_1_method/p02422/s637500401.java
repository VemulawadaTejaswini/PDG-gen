import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++){
            String[] s = br.readLine().split(" ");
            int a = Integer.parseInt(s[1]);
            int b = Integer.parseInt(s[2]);

            switch(s[0]){
                case "print":
                    System.out.println(str.substring(a , b+1));
                    break;
                case "reverse":
                    int box = (b-a)/2;
                    char[] c = str.toCharArray();
                    for(int j = 0; j <= box; j++){
                        char tmp = str.charAt(a+j);
                        c[a+j] = c[b-j];
                        c[b-j] = tmp;
                    }
                    str = String.valueOf(c);
                    break;
                case "replace":
                    StringBuilder sb = new StringBuilder(str);
                    sb.replace(a , b+1 , s[3]);
                    str = sb.toString();
                    break;
            }
        }
    }
}
