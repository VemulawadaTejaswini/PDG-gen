import java.util.Scanner;
import java.util.stream.Stream;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {
 
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); 
        int K = sc.nextInt(); 
        String str = sc.next(); 
        String [] strArray = str.split("");
        int[] ia = new int[N];
        int sum = 0;
        int max = 0;
        int kaisu = 0;
        int range = 0;

        for (int i = 0; i < N; i++) {
            ia[i] = Integer.parseInt(strArray[i]); 
        }

        ArrayList<Integer> array = new ArrayList<Integer>();

        int count = 0;
        int now = 1;

        for(int i = 0; i < N ; i++){
            
            if(ia[i] == '1' || ia[i] == now ){
                count++; 
            }
            
            else{
                array.add(count);
                now = 1 - now;
                count = 1;
            }
        }
        array.add(count);

        if (array.size() % 2 == 0) {
            array.add(0);
        }


        for(int i = 0; i < array.size() ; i = i+2){
            int cnt = i;
            sum = 0;
            for(int j = cnt; j < (range = (cnt + 1 + K * 2) < array.size() ? (cnt + 1 + K * 2) : array.size()); j++){
                sum = sum + array.get(j) ;
//                    System.out.println(j);
                }
//                System.out.println(i + " " +sum);
            max = Math.max(max, sum);
        }

        System.out.println(max);
    }
}