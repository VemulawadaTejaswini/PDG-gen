import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Integer numMonster = sc.nextInt();
        Integer numHissatsu = sc.nextInt();
        sc.nextLine();
        
        int count = 0;
        long[] hpLine = new long[numMonster];
        while (sc.hasNext()) {
            long j = sc.nextInt();
            hpLine[count] = j;
            count++;
        }
        
        sc.close();
        
        Arrays.sort(hpLine);
        
        long cnt = 0;
        Integer startInt = numMonster - numHissatsu - 1;
        
        for(int i = startInt; i >= 0; i--) {
            cnt = cnt + hpLine[i];
        }
        
        System.out.println(cnt);
    }
}
