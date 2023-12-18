import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


/**
 * Created by Reopard on 2014/07/03.
 */
public class Main{

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] c = new char[100];
        char tmp;
        boolean flag=true;
        int p = 0;
        String text;
        while(true){
            text = br.readLine();
            p = 0;
            flag=true;
            if(text.equals(".")) break;

            for(int i = 0; i < text.length(); i++){
                tmp = text.charAt(i);

                if(tmp == '('){
                    c[p] = '(';
                    p++;
                }else if(tmp == '['){
                    c[p] = '[';
                    p++;
                }else if(tmp == ')'){
                    if(p > 0 && c[p - 1] == '('){
                        p--;
                    }else{
                        flag=false;
                    }
                }else if(tmp == ']'){
                    if(p > 0 && c[p - 1] == '['){
                        p--;
                    }else{
                        flag=false;
                    }
                }else if(tmp == '.'){
                    if(p == 0 && flag){
                        System.out.println("yes");
                        break;
                    }else{
                        System.out.println("no");
                        break;
                    }
                }
                if(i == text.length() - 1){
                    i = -1;
                    text = br.readLine();
                }
            }

        }
    }
}