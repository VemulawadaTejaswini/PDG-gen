import java.util.*;
import java.io.*;


class Ballance {
    public String line;

    public Ballance(String str){
        line = str;
    }

    public void init(){
        String res = "";

        for(int i=0; i<line.length(); i++){
            char ch = line.charAt(i);
            if (ch == '(' || ch == '[' || ch == ')' || ch  == ']'){
                res += String.valueOf(ch);
            }
        }
        this.line = res;
    }

    public boolean check(int index){
        boolean ret = false;

        if(line.length() == 0){
            return true;
        }else if (line.charAt(index) == ')' || line.charAt(index) == ']'){
            ret = false;
        }else if (line.charAt(index) == '(' && line.charAt(index+1) == ')'
            || line.charAt(index) == '[' && line.charAt(index+1) == ']'){
            ret = true;
        }else if (line.charAt(index) == '(' && line.charAt(index+1) == ']'
            || line.charAt(index) == '[' && line.charAt(index+1) == ')'){
            ret = false;
        }else if(line.charAt(index+1) == '(' || line.charAt(index+1) == '['){
            ret = check(index+1);
        }

        if(ret){
            if(index+1 <= this.line.length()){
                ret = true;
            }else if(index+2 < this.line.length()){
                ret = check(index+2);
            }
        }else{
            ret = false;
        }

        return ret;
    }
}

public class TheBallance{

    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = ".";
            try{
                str = br.readLine();
            }catch(IOException e){ }

            if(str.length() == 1 && str.charAt(0) == '.'){
                break;
            }

            Ballance ball = new Ballance(str);
            ball.init();

            int len = ball.line.length();
            if(len == 1){
                System.out.println("no");
                break;
            }else if(len == 0){
                System.out.println("yes");
                break;
            }

            if(ball.check(0)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }

    }

}