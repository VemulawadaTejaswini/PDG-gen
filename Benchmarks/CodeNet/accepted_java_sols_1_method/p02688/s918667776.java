import java.util.*;

class Main{
    public Main(){
        Scanner SC = new Scanner(System.in);

        int N = Integer.parseInt(SC.next());
        int K = Integer.parseInt(SC.next());

        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<K;i++){
            int d = Integer.parseInt(SC.next());
            for(int j=0;j<d;j++){
                set.add(Integer.parseInt(SC.next()));
            }
        }
        System.out.println(N-set.size());
    }

    public static void main(String args[]){
        Main main = new Main();
    }
}
