import java.util.*;

public class Main {
    public static void main(String[] args){

        Scanner scan = new Scanner( System.in );

        int n = Integer.parseInt( scan.next() );

        Integer[] a = new Integer[n];

        for(int i=0; i<n; i++){
            a[i] = Integer.parseInt( scan.next() );
        }

        Arrays.sort(a,Collections.reverseOrder());


        int count = 0;

        Roop:
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++){
                if( a[i] % a[j] == 0){
                    continue Roop;
                }
            }
            count++;
        }
        //最小の値は必ず割り切れないため1つ追加
        if(count != 0){
            count++;
        }
        
        System.out.println(count);
    }
}