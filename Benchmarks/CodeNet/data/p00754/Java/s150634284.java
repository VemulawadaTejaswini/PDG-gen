import java.util.*;
import java.io.*;

public class Main {
    Stack<String> stack = new Stack<String>();

    String clear(String line){
        String res = "";
        for(int i=0; i<line.length(); i++){
            char c = line.charAt(i);
            if( c == '(' || c == ')' || c == '[' || c == ']' || c == '.'){
                res += String.valueOf(c);
            }
        }
        return res;
    }

    public static void main(String[] args){
        Main m = new Main();
        m.run();
    }


    void run(){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = ".";

            try{
                line = br.readLine();
            }catch(IOException e){ }

            // end
            if(line.charAt(0) == '.'){
                break;
            }

            line = clear(line);  // カッコとドットだけにする

            //System.out.println(line);
            if(line.length() == 1){ // >>  .
                System.out.println("yes");
                continue;
            }else if(line.length()%2 == 0){  // .の分+1
                //System.out.println("奇数");
                System.out.println("no");
                continue;
            }

            // 1文字毎のチェック
            boolean f = true;
            int pu = 0;
            int po = 0;
            stack = new Stack<String>();
            for(int i=0; i<line.length(); i++){
                f = true;
                String s = line.substring(i, i+1);
                //System.out.println(i + " " + s);
                if(s.equals(".")){
                    f = stack.empty();
                    //System.out.println(f);
                    break;
                }else if(s.equals("(") || s.equals("[")){  // push
                    stack.push(s);
                    pu++;
                    //System.out.println("push " + s);
                }else{
                    String head = "";
                    try{
                        head = stack.pop();
                        //System.out.println("pop " + head);
                        po++;
                    }catch(EmptyStackException e){  // あまりが出た
                        f = false;
                        //System.out.println("あまり");
                        break;
                    }

                    if(head.equals("(") && s.equals("]") || head.equals("[") && s.equals(")")){  // ちぐはぐ
                        f = false;
                        //System.out.println("ちぐはぐ");
                        break;
                    }
                }
                //System.out.println(stack);
            }

            
            //System.out.printf("pu %d po %d\n", pu, po);
            if(f){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }

        }

    }

}