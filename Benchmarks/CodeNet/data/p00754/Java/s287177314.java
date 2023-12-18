import java.util.*;
import java.io.*;

public class Main {

    private class Ballance {
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
            line = res;
        }

        public boolean check(int index){
            boolean ret = false;

            if (line.charAt(index) == ')' || line.charAt(index) == ']'){
                ret = false;
            }
            if(line.length()-1 < index+1){
                return false;
            }else{
                if (line.charAt(index) == '(' && line.charAt(index+1) == ')'
                 || line.charAt(index) == '[' && line.charAt(index+1) == ']'){
                    ret = true;
                }else if (line.charAt(index) == '(' && line.charAt(index+1) == ']'
                       || line.charAt(index) == '[' && line.charAt(index+1) == ')'){
                    ret = false;
                }else if(line.charAt(index+1) == '(' || line.charAt(index+1) == '['){
                    ret = check(index+1);
                }
            }

            if(ret){
                if(index+1 <= line.length()){
                    ret = true;
                }else if(index+2 < line.length()){
                    ret = check(index+2);
                }
            }else{
                ret = false;
            }

            return ret;
        }

        public boolean numCheck(){
            int a=0, b=0;
            char c;
            for(int i=0; i<line.length(); i++){
                c = line.charAt(i);
                if( c == '('){
                    a++;
                }else if( c == ')'){
                    a--;
                }else if(c == '['){
                    b++;
                }else if(c == ']'){
                    b--;
                }
                if(a<0 || b <0){
                    return false;
                }
            }

            if(0<a || 0<b){
                return false;
            }else{
                return true;
            }
        }
    }

    public static void main(String[] args){
        Main main = new Main();
        main.run();
    }

    public void run(){
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
                continue;
            }else if(len == 0){
                System.out.println("yes");
                continue;
            }else if(len % 2 == 1){
                System.out.println("no");
                continue;
            }

            if(!ball.numCheck()){
                System.out.println("no");
                continue;
            }

            if(ball.check(0)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }

    }

}