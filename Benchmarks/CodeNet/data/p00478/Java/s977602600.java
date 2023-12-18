import java.util.*;

class Main{

    void solve(){
        Scanner sc = new Scanner(System.in);

        char[] find = sc.next().toCharArray();
        int n = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++){
            char[] ring = sc.next().toCharArray();

            int idx = 0;
            for(int j=0; j<ring.length + find.length; j++){
                if(find[idx]==ring[j%ring.length]){
                    idx++;
                    if(idx==find.length){
                        count++;
                        break;
                    }
                }else idx = 0;
            }
        }

        System.out.println(count);
    }

    public static void main(String[] args){
        new Main().solve();
    }
}