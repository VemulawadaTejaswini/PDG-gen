import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            String n = sc.next();
            if(n.equals("0000")) break;

            boolean boo = true;
            for(int i=0; i<n.length(); i++){
                if(n.charAt(i)!=n.charAt(0)) boo = false;
            }
            if(boo){
                System.out.println("NA");
                continue;
            }

            int cnt = 0;
            while(!n.equals("6174")){
                char[] nn = n.toCharArray();
                Arrays.sort(nn);
                int min = 0, max = 0;
                int ten = 1;
                for(int i=0; i<nn.length; i++){
                    min += (nn[nn.length-1-i]-'0') * ten;
                    max += (nn[i]-'0') * ten;
                    ten *= 10;
                }
                n = String.valueOf(max - min);
                while(n.length()!=4) n = "0" + n;
                cnt++;
            }
            System.out.println(cnt);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}