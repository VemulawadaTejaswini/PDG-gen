import java.util.*;
//import java.lang.Math;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            int L=0;
            int l[]=new int[2];
            int r[]=new int[2];
            boolean fin=false;
            boolean ans=true;
            Stack<Character> st=new Stack<Character>();
            while(true){
                String S=sc.nextLine();
                if(L==0 && S.equals(".")){
                    fin=true;
                    break;
                }
                int N=S.length();
                L+=N;
                char C[]=S.toCharArray();
                for(int i=0;i<N;i++){
                    if(C[i]=='('){
                        l[0]++;
                        st.push('(');
                    }
                    else if(C[i]=='['){
                        l[1]++;
                        st.push('[');
                    }
                    else if(C[i]==')'){
                        if(st.empty()){
                            ans=false;
                            break;
                        }
                        char la=st.pop();
                        if(la=='[') ans=false;
                        if(l[0]>0) l[0]--;
                        else ans=false;
                    }
                    else if(C[i]==']'){
                        if(st.empty()){
                            ans=false;
                            break;
                        }
                        char la=st.pop();
                        if(la=='(') ans=false;
                        if(l[1]>0) l[1]--;
                        else ans=false;
                    }
                }
                if(C[N-1]=='.'){
                    if(l[0]!=0 || l[1]!=0){
                        ans=false;
                        break;
                    }
                    else break;
                }
            }
            if(fin) break;
            if(ans) System.out.println("yes");
            else System.out.println("no");
        }
    }
}
