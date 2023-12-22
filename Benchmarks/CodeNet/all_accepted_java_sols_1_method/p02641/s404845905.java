import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner( System.in );

        int x = Integer.parseInt( scan.next() );
        int n = Integer.parseInt( scan.next() );

        int[] p = new int[n];

        for(int i=0; i<n; i++){
            p[i] = Integer.parseInt( scan.next() );
        }

        Arrays.sort(p);

        Roop:
        for(int i=0; i<Integer.MAX_VALUE; i++){
            boolean flag = true;
            for(int j=0; j<n; j++){
                if(x-i == p[j]){
                    flag = false;
                    break;
                }
            }
            if(flag){
                System.out.println(x-i);
                break Roop;
            }
            for(int j=0; j<n; j++){
                if(x+i == p[j]){
                    continue Roop;
                }
            }
            System.out.println(x+i);
            break Roop;
        }
        

    }
}