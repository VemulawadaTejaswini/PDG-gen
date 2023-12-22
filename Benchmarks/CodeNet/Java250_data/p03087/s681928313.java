import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int q = scanner.nextInt();
        String s = scanner.next();
        int[] l = new int[q];
        int[] r = new int[q];
        for (int i=0;i<q;i++){
            l[i] = scanner.nextInt();
            r[i] = scanner.nextInt();
        }
        int[] integer = new int[n];
        integer[0] = 0;
        for (int i=0;i<n-1;i++){
            if (s.charAt(i)=='A'&&s.charAt(i+1)=='C'){
                integer[i+1]=integer[i]+1;
            }else {
                integer[i+1]=integer[i];
            }
        }

        for (int i=0;i<q;i++){
            System.out.println(integer[r[i]-1]-integer[l[i]-1]);
        }
    }

}