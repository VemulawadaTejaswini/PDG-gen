import java.util.*;

public class Main{

    int cnt;

    void solve(){
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        char[] c = line.toCharArray();
        cnt = 0;
        for(int i=0; i<c.length/2; i++){
            if(c[i]=='(' && c[c.length-i-1]!=')') cnt++;
            if(c[i]==')' && c[c.length-i-1]!='(') cnt++;
            if(c[i]=='w' && c[c.length-i-1]!='w') cnt++;
            if(c[i]=='i' && c[c.length-i-1]!='i') cnt++;
        }
        if(c.length%2!=0){
            if(c[c.length/2+1]!='w' && c[c.length/2+1]!='i') cnt++;
        }
        System.out.println(cnt);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}