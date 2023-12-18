import java.io.FileInputStream;
import java.util.Scanner;


public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) throws Exception{
        
//        System.setIn(new FileInputStream("text"));
        while(hasNext()){
            StringBuilder s = new StringBuilder(NS());
            StringBuilder ans=new StringBuilder();
            if(s.length()==0)return;
            for (int i = 0; i < s.length(); i++) {
                if(s.charAt(i)=='@'){
                    i++;
                    int len = s.charAt(i)-'0';
                    i++;
                    for (int j = 0; j < len; j++) {
                        ans.append(s.charAt(i));
                    }
                } else {
                    ans.append(s.charAt(i));
                }
            }
            System.out.println(ans);
        }

    }

    
    static int c=0;
    static int NI(){
        try {
            c=System.in.read();
            int r=0;
            for(;c!='-'&&(c<'0'||'9'<c);)c=System.in.read();
            if(c=='-') return -NI();
            for(;'0'<=c&&c<='9';c=System.in.read())
                r = r * 10 + c - '0';
            return r;
        } catch (Exception e) {
            return -1;
        }
    }
    
    static long NL(){
        try {
            c=System.in.read();
            long r = 0;
            for(;c!='-'&&(c<'0'||'9'<c);)c=System.in.read();
            if(c=='-') return -NL();
            for(;'0'<=c&&c<='9';c=System.in.read())
                r = r * 10 + c - '0';
            return r;
        } catch (Exception e) {
            return -1;
        }
    }
    
    static char NC(){
        try {
            c=System.in.read();
            for(;isSkip();)c=System.in.read();
            return (char)c;
        } catch (Exception e) {
            return 0;
        }
    }
    
    static String NS(){
        StringBuilder sb=new StringBuilder();
        try {
            c=System.in.read();
            skip();
            for(;!isSkip();){
                sb.append((char)c);
                c=System.in.read();
            }
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }
    
    static String NLine(){
        StringBuilder sb=new StringBuilder();
        try {
            c=System.in.read();
            for(;c!='\n'&&c!='\r';){
                sb.append((char)c);
                c=System.in.read();
            }
            return sb.toString();
        } catch (Exception e) {
            return "";
        }
    }
    
    static void skip(){
        
        try{
            c=System.in.read();
            while(isSkip()){
                c=System.in.read();
            }
            c=c;
        } catch (Exception e) {
            
        }
    }
    
    static boolean hasNext(){
        skip();
        return c!=-1;
    }
    
    static boolean isSkip(){
        return 0 <= c && c <= ' ';
    }
}