import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        sc.close();
        char[] c = new char[n];
        for(int i = 0 ; i < n ; i++){
            c[i] = s.charAt(i);
        }
        boolean ebishu = true;
        for(int i = 0 ; i < n ; i++){
            if(c[0] != c[i]) ebishu = false;
        }
        if(ebishu){
            System.out.println(0);
        }else{
            int[] a = new int[n];
            for(int i = 0 ; i < n ; i++){
                if(c[i] == 'R'){
                    a[i] = 0;
                }else{
                    a[i] = 1;
                }
            }
            int[] b = new int[n];
            for(int i = 0 ; i < n ; i++){
                b[i] = a[i];
            }
            Arrays.sort(b);
            int yono = 1;
            for(int i = 0 ; i < n ; i++){
                if(a[i] != b[i]){
                    yono++;
                }
            }
            System.out.println(yono / 2);
        }
    }
}