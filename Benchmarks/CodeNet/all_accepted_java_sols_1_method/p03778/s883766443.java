import java.util.*;
public class Main{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int w = sc.nextInt();
                int[] a = new int[2];
                for(int i = 0 ; i < 2 ; i++){
                        a[i] = sc.nextInt();
                }
                sc.close();
                Arrays.sort(a);
                if(a[1] - a[0] <= w){
                        System.out.println(0);
                }else{
                        System.out.println(a[1] - a[0] - w);
                }
        }
}//0=48
//鶏になれ