import java.util.Scanner;



public class I{
    public static final int MP = 200010; //MaxPassengers
    public static final int MSN = 100010; //MaxStationNumber
    public static class p{
        int bp; //boarding point
        int dp; //deplaning
    }
    public static void main(String[] args){
        int P1 = 0, P2 = 0;
        p[] pas = new p[MP]; //passenger
        int[] igo = new int[MSN]; //is getting on
        int[] agon = new int[MSN]; //already getting on
        int[] agoff= new int[MSN]; //already getting off 
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        for(int i = 0; i < n; i++){
            pas[i] = new p(); 
            pas[i].bp = Integer.parseInt(sc.next());
            pas[i].dp = Integer.parseInt(sc.next());
            igo[pas[i].bp]++;
            igo[pas[i].dp]--;
            agon[pas[i].bp]++;
            agoff[pas[i].dp]++;
        }
        for(int j = 1; j < MSN; j++){ //make Accumulation
            igo[j] += igo[j-1];
            agon[j] += agon[j-1];
            agoff[j] += agoff[j-1];
            if(P2 < igo[j]){ //Policy 2
                P2 = igo[j];
            }
        }
        for(int k = 1; k < n; k++){
            //i番目の人が降りる一つ前までの駅までに乗ってきた人数-i番目の人が乗る駅で降りている人数
            if(P1 < (agon[pas[k].dp - 1] - agoff[pas[k].bp])){ 
                P1 = agon[pas[k].dp - 1] - agoff[pas[k].bp];
            }
        }
        System.out.println(P1 + " " + P2);
        sc.close();   
    }
}
