import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] in1 = s.nextLine().split(" ");
        String[] in2 = s.nextLine().split(" ");
        List<Integer> monsters = new ArrayList<Integer>();
        for(int i = 0;i<n+1;i++){
            monsters.add(Integer.parseInt(in1[i]));
        }
        long r = 0;
        for(int i = 0;i<n;i++){
            int power = Integer.parseInt(in2[i]);
            int targets1 = monsters.get(i);
            int targets2 = monsters.get(i+1);
            if(power - targets1 >= 0) {
                r += targets1;
                power -= targets1;
                if(power - targets2 >= 0){
                    r += targets2;
                    monsters.set(i+1,0);
                }else {
                    r += power;
                    monsters.set(i+1,targets2-power);
                }
            }else{
                r += power;
            }
        }
        System.out.println(r);
    }
}