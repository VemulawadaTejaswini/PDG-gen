import java.math.BigInteger;
import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        ArrayList<Long> enemy = new ArrayList<Long>(n);
        long count = 0;

        if(n <= k) {System.out.println(count); scan.close();}
        else{
            for(int i = 0;i < n;i++){
                enemy.add(scan.nextLong());
            }
            scan.close();
            Collections.sort(enemy);

            for(int j = 0; j < n-k;j++) count += enemy.get(j);
            System.out.println(count);
        }
    }
}