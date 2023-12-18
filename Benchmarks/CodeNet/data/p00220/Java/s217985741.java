import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            double n = sc.nextDouble();
            if(n==-1.0) break;

            n = n * 2 * 2 * 2 * 2;
            if(n%1.0!=0){
                System.out.println("NA");
                continue;
            }

            String s = Integer.toBinaryString((int)n);
            if(s.length()>12){
                System.out.println("NA");
                continue;
            }
            String seisu = s.substring(0, s.length()-4);
            String syousu = s.substring(s.length()-4, s.length());
            while(seisu.length()!=8) seisu = "0" + seisu;
            System.out.println(seisu+"."+syousu);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}