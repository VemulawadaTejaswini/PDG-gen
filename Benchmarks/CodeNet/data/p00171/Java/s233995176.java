import java.util.*;
public class Main {
    Dice [] data;
    boolean flg;
    boolean [] used;
    ArrayList<ArrayList<Dice>> map;
    String [] order = {"", "n", "s", "e", "w", "nn"};
    String [] orderrev = {"", "s", "n", "w", "e", "nn"};
    int [][] pos = {
            {},
            {0},
            {0},
            {1,2},
            {0},
            {4,1},
            {4,2},
            {3,5,6}
    };
    int [][] face = {
            {},
            {2},
            {1},
            {1,2},
            {4},
            {2,4},
            {1,4},
            {4,1,2}
    };


    //dice is, 2 = south, 3 = east, 1 = top, 6 = bottom, 4 = west, 5 = north;
    class Dice{
        int [] dice;
        public Dice(int[] dice) {
            
            this.dice = new int[dice.length];
            for(int i = 0 ; i < dice.length; i++){
                this.dice[i] = dice[i];
            }
        }
        private void slide() {
            swap(2,4,5,3);
        }
        private void turn(char c) {
            switch(c){
            case 'n':
                swap(1,5,6,2); break;
            case 's':
                swap(1,2,6,5); break;
            case 'w':
                swap(1,4,6,3); break;
            case 'e':
                swap(1,3,6,4); break;
            }
        }
        private void swap(int i, int j, int k, int l) {
            int temp = dice[l];
            dice[l] = dice[k];
            dice[k] = dice[j];
            dice[j] = dice[i];
            dice[i] = temp;
        }
        public String toString(){
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i <= 6; i++){
                sb.append((char)(dice[i]) + " ");
            }
            return sb.toString();
        }
    }

    private void doit(){
        Scanner sc = new Scanner(System.in);
        while(true){
            Dice [] d = new Dice[8];
            String s = sc.next();
            if(s.equals("0")) break;
            d[0] = create(s);
            for(int i = 1; i < 8; i++){
                s = sc.next();
                Dice tempd = create(s);
                d[i] = tempd;
            }
            init(Arrays.copyOf(d, d.length));
            data = new Dice[8];
            flg = false;
            used = new boolean[8];
            dfs(0);
            if(flg){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

        }
    }

    private void init(Dice[] d) {
        map =  new ArrayList<ArrayList<Dice>>();
        for(int i = 0; i < 8; i++){
            map.add(new ArrayList<Dice>());
        }

        for(int ii = 0; ii < 8; ii++){
            for(int i = 0; i < order.length; i++){
                for(int j = 0; j < order[i].length(); j++){
                    d[ii].turn(order[i].charAt(j));
                }

                for(int j = 0; j < 4; j++){
                    d[ii].slide();
                    map.get(ii).add(new Dice(d[ii].dice));
                }
                for(int j = 0; j < orderrev[i].length(); j++){
                    d[ii].turn(orderrev[i].charAt(j));
                }
            }
        }
//        for(int ind = 0; ind < map.size(); ind++){
//            for(int i = 0 ; i < map.get(ind).size(); i++){
//                System.out.println(map.get(ind).get(i));
//            }
//            System.out.println("////");
//        }

    }

    private void dfs(int deep) {
        //System.out.println("deep " + deep);
        if(deep == 8){
            flg = true;
            return ;
        }
        
        for(int i = 0; i < 8; i++){
            if(! used[i]){
                used[i] = true;
                for(int j = 0; j < map.get(i).size(); j++){
                    Dice now = map.get(i).get(j);
                    boolean isOK = true;
                    for(int k = 0; k < pos[deep].length; k++){
                        int myface = face[deep][k];
                        if(! match(data[pos[deep][k]].dice[7 - myface], now.dice[myface])){
                            isOK = false;
                            break;
                        }
                    }
                    if(isOK){
                        data[deep] = now;
                        dfs(deep+1);
                        if(flg) return ;
                    }
                }
                used[i] = false;
            }
        }
    }

    private boolean match(int i, int j) {
        if(Math.abs(i - j) == ('a' - 'A')){
            return true;
        }
        return false;
    }
    private Dice create(String s) {
        int [] res = new int[7];
        for(int i = 0; i < 6; i++){
            char c = s.charAt(i);
            res[i+1] = c;
        }
        return new Dice(res);
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.doit();
    }
}