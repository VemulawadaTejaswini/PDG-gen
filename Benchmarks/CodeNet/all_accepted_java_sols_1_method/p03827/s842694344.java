import java.util.*;
 
public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);


        int N = Integer.parseInt(sc.next());
        String s1 = sc.next();
        char[] c1 = s1.toCharArray();


        int max = 0;
        int a = 0;
        for(int i=0;i<N;i++){
            
            if( c1[i] == 'I' ) a++;
            else a--;
            
            if(a>max) max = a ;
            
        }



        System.out.print(max);
        System.out.println();
    }

}