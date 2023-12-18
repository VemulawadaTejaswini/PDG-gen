import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        while(true){
            int math = sc.nextInt(), greedy = sc.nextInt(), geo = sc.nextInt();
                int dp = sc.nextInt(), graph = sc.nextInt(), other = sc.nextInt();
            if(math==0 && greedy==0 && dp==0 && graph==0 && other==0) break;
            
            int type1 = math + dp, type2 = greedy + graph, type3 = geo + other;
            int max = 0;
            for(int i=0; i<=2; i++){
                if(type1>=i && type2>=i && type3>=i)
                    max = Math.max(max, i + (type1-i)/3 + (type2-i)/3 + (type3-i)/3);
            }
            System.out.println(max);
        }
    }

    public static void main(String[] args){
        new Main().solve();
    }
}