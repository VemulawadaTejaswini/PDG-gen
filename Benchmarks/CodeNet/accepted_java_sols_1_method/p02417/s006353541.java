import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int alf[];
        alf=new int[256];
        while(sc.hasNext()){
            String S=sc.next();
            int L=S.length();
            S=S.toLowerCase();
            char s[]=S.toCharArray();
            for(int i=0;i<L;i++){
                if(s[i]=='.') continue;
                if(s[i]-'a'>=0 && s[i]-'a'<=25) alf[s[i]-'a']++;
            }
        }
        for(int i=0;i<26;i++) System.out.printf("%c : %d\n",'a'+i,alf[i]);
    }
}

