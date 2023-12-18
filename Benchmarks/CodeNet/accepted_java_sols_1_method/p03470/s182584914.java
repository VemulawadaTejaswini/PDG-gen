import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] d = new int[n];
                for(int i = 0 ; i < n ; i++){
                        d[i] = sc.nextInt();
                }
                sc.close();
                Arrays.sort(d);
                int yono = 1;
                for(int i = 1 ; i < n ; i++){
                        if(d[i - 1] != d[i]) yono++;
                }
                System.out.println(yono);
        }
}
//鶏になれ