import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int n = sc.nextInt();
            if(n==0) break;

            int n2 = n;
            boolean boo = true;
            while(n2!=0){
                if(n%10!=n2%10){boo = false; break;}
                else n2 /= 10;
            }
            if(boo){
                System.out.println("NA");
                continue;
            }


            int cnt = 0;
            while(n!=6174){
                char[] nn = String.valueOf(n).toCharArray();
                Arrays.sort(nn);
                int min = 0, max = 0;
                int ten = 1;
                for(int i=0; i<nn.length; i++){
                    min += (nn[nn.length-1-i]-'0') * ten;
                    max += (nn[i]-'0') * ten;
                    ten *= 10;
                }
                n = max - min;
                cnt++;
            }
            System.out.println(cnt);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}