import java.util.*;
import java.util.Arrays;
import java.lang.Math;
 
public class Main{
        public static void main(String[] args){
                Scanner scanCnt = new Scanner(System.in);
                int N = scanCnt.nextInt();
                int Array[] = new int[N];
                int sum =0;
                for(int i = 0 ; i < N ; i++ ){
                        Array[i]=scanCnt.nextInt();
                        sum += Array[i];
                }
 
                Arrays.sort(Array);
                int max = Array[N-1];
 
                if(max<sum-max){
                        System.out.println("Yes");
                }else{
                        System.out.println("No");
                }
        }
}