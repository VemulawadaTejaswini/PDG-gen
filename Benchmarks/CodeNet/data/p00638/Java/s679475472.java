import java.util.*;

public class AOJ_1052{
    class Island implements Comparable{
        public int weight;
        public int limit;
        public Island(int weight, int limit){
            this.weight = weight;
            this.limit = limit;
        }
        public int compareTo(Object other){
            Island is = (Island)other;
            return this.limit - is.limit;
        }
    }
    void run(){
        Scanner sc = new Scanner(System.in);
        while(true){
            int n = sc.nextInt();
            if(n == 0){
                break;
            }
            Island[] islands = new Island[n];
            for(int i = 0; i < n; i++){
                islands[i] = new Island(sc.nextInt(), sc.nextInt());
            }
            /*
            for(int i = 0; i < n; i++){
                System.out.println(i + ": " + islands[i].weight + " " + islands[i].limit);
            }
            */
            Arrays.sort(islands);
            boolean ans = true;
            int sum = 0;
            for(Island is: islands){
                sum += is.weight;
                if(is.limit < sum){
                    ans = false;
                    break;
                }
            }
            System.out.println(ans?"Yes":"No");
        }
        
    }

    public static void main(String[] args){
        new AOJ_1052().run();
    }
}