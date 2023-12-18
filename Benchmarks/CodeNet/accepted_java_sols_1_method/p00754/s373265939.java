import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            String s=sc.nextLine();
            if(s.equals(".")) break;
            int ok=1;
            LinkedList<Character> st=new LinkedList<Character>();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='('||s.charAt(i)=='['){
                    st.addFirst(s.charAt(i));
                }
                else if(s.charAt(i)==')'||s.charAt(i)==']'){
                    
                    if(st.isEmpty()){
                        ok=0;
                        break;
                    }
                    char a=s.charAt(i);
                    char c=st.getFirst();
                    st.removeFirst();
                    if(a==')'){
                        if(c!='('){
                            ok=0;
                            break;
                        }
                    }else{
                        if(c!='['){
                            ok=0;
                            break;
                        }
                    }
                }
            }
            if(!st.isEmpty()) ok=0;
            String ans;
            if(ok==1) ans="yes";
            else ans="no";
            System.out.println(ans);
        }
    }
}
