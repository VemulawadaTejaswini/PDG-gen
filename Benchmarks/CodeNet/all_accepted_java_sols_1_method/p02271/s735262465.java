import java.util.*;
 
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        int[] an = new int[n];
        for(int i=0; i<n; i++){
            an[i] = Integer.parseInt(sc.next());
        }
        int queri = Integer.parseInt(sc.next());
        int target = 0;
        int sum=0, bit=0;
        for(int i=0; i<queri; i++){
            target = Integer.parseInt(sc.next());
            for(bit=0; bit < (1<<n); bit++){
                sum=0;
                for(int j=0; j<n; j++){
                    if((bit&(1<<j)) > 0){
                        sum += an[j];
                    }
                }
                if(sum == target){
                    System.out.println("yes");
                    break;
                }
            }
            if(bit == (1<<n)) System.out.println("no");
        }
    }
}
