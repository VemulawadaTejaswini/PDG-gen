import java.util.*;
public class Main {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in).useDelimiter("[s,]+");
        while(sc.hasNextLine()){
            char[] cs=sc.nextLine().toCharArray();
            for(int j=0;j<26;j++){
                String s = new String(cs);
                if(s.matches(".*(this|that|the).*"))break;
                for(int i=0;i<cs.length;i++)cs[i]=decode(cs[i]);
            }
            System.out.println(new String(cs));
        }
    }
    static char decode(char c){
        return Character.isLetter(c)?(char)((c-'a'+25)%26+'a'):c;
    }
}