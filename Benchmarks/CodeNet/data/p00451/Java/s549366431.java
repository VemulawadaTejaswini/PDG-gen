import java.util.*;

public class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(sc.hasNext()){
            String s1 = sc.next();
            String s2 = sc.next();

            int max = 0;
            for(int i=0; i<s1.length(); i++){
                for(int j=i+1; j<=s1.length(); j++){
                    String s = s1.substring(i,j);
                    if(s2.indexOf(s)!=-1){
                        max = Math.max(max,s.length());
                    }
                }
            }

            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}