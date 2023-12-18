import java.util.*;

class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                while(sc.hasNext()){
                        String s = sc.nextLine();
                        String s_ = s;
                        do{ 
                                String tmp = ""; 
                                for(int i = 0; i < s.length(); i++){
                                        char c = s.charAt(i);
                                        if(c != '.' && c != ' '){
                                                c++;
                                                if(c > 'z'){
                                                        c -= 26; 
                                                }     
                                        }   
                                        tmp += c;
                                }   
                                s = tmp;
                        }while(!s.equals(s_) && s.indexOf("the") == -1 && s.indexOf("this") == -1 && s.indexOf("that") == -1); 
                        System.out.println(s);
                }   
        }   
}