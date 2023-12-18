import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] c = new int[n];
        int[] v = new int[n];
        for(int i=0;i<n;i++){
            v[i] = Integer.parseInt(sc.next());
        }
        for(int i=0;i<n;i++){
            c[i] = Integer.parseInt(sc.next());
        }
        sc.close();
        int val = 0;
        for(int i=0;i<n;i++){
            if(v[i]-c[i]>0){
                val+=v[i]-c[i];
            }
        }
        System.out.println(val);
    }

}