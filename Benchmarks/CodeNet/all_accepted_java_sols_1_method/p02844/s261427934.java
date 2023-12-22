import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[] arr = sc.next().toCharArray();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Character.getNumericValue(arr[i]);
        }
        int ans = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    boolean jb = false;
                    boolean kb = false;
                    for (int m = 0; m < n; m++) {
                        if(kb){
                            if(jb){
                                if(a[m] == i){
                                    ans++;
                                    break;
                                }
                            }else{
                                if(a[m] == j) jb = true;
                            }
                        }else{
                            if(a[m] == k)kb = true;
                        }
                    }
                }
            }
        }
        System.out.println(ans);
        sc.close();

    }

}
