    import java.util.*;
    public class Main {// Main
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int[] a = new int[3];
            for(int i=0;i<3;i++) a[i] = sc.nextInt();
            Arrays.sort(a);
            int ans = a[0] + a[1];
            System.out.println(ans);
        }
    }							