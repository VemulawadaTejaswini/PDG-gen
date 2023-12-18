        import java.io.*;
        import java.util.*;
        public class Main{
          public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s = reader.readLine();
            Stack<String> stack = new Stack<String>();
            for(int i=0;i<s.length();i++){
              if(s.charAt(i)=='0'){
                stack.push("0");}
              if(s.charAt(i)=='1'){
                stack.push("1");}
              if(s.charAt(i)=='B' && !stack.isEmpty()){
                stack.pop();}}
            String res = "";
            while(!stack.isEmpty()){
                String p = stack.pop();
              res = p+res;}
            System.out.println(res);}}