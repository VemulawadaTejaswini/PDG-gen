import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        long N = s.nextLong();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        //int[] foo = new int[N];
        long amari;
        //long iti = 1;
        String str = "";
         for(int i = 0; N != 0; i++) {
             if(N%26 !=0){
                 amari = (N %26) - 1;
             }else amari = 25;
            str = alphabet[(int)amari ] + str;
            N = N /26;
            
        }
        
        // int sum = 0; 
        // Arrays.sort(foo);
        
        // for(int i = 0; i < K;i++) {
        //     sum+= foo[i];
        // }
        System.out.println(str);
    }
}
