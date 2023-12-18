import java.util.*;
public class Main{
    public static void main(String args[]){
        String b="";        
        Scanner kbd=new Scanner(System.in);
        b=kbd.nextLine();
        while(!b.equals(".")){
            LinkedList<Character> a=new LinkedList<Character>();
            boolean ans=true;
            char[] c=b.toCharArray();
            for(int i=0;i<c.length;i++){
                if(c[i]=='[' || c[i]=='(') a.add(c[i]);
                else if(c[i]==']' || c[i]==')') {
                    if(a.size()==0){ans=false;break;}
                    else if(a.peekLast()=='('&&c[i]==')')a.pollLast();
                    else if(a.peekLast()=='['&&c[i]==']')a.pollLast();
                    else {ans=false;break;}
                }
                
            }
            if(a.size()>0)ans=false;
            if(!ans) System.out.println("no");
            else  System.out.println("yes");
            b=kbd.nextLine();
        }
    }
}