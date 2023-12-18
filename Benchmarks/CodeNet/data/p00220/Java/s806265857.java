import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        String line = sc.next();
        while(!line.equals("-1.0")){
            String s1 = "", s2 = "";

            boolean boo = false;
            for(int i=0; i<line.length(); i++){
                if(line.charAt(i)=='.'){
                    boo = true;
                    continue;
                }
                if(!boo) s1 += line.charAt(i);
                else s2 += line.charAt(i);
            }

            int seisu = Integer.parseInt(s1);
            double syousu = Double.parseDouble(s2) * 0.1;
            
            String ans = "";
            while(seisu>0){
                if(seisu%2!=0) ans = "1" + ans;
                else ans = "0" + ans;
                seisu /= 2;
            }

            while(ans.length()<8) ans = "0" + ans;
            ans += ".";

            double eps = 1e-8;
            
            double d = 1.0;
            int cnt = 0;
            while(syousu>0.0+eps){
                d /= 2.0;
                if(syousu>=d-eps){
                    ans += "1";
                    syousu -= d;
                }
                else ans += "0";
            }

            while(ans.length()<13) ans += "0";

            if(ans.length()>13){
                System.out.println("NA");
                return;
            }
            
            System.out.println(ans);
            line = sc.next();
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}