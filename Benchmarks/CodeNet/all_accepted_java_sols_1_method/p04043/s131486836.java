import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //String a = sc.next(), b = sc.next(), c = sc.next();

        int[] n = new int[3];
        for(int i=0;i<3;i++){
            n[i]=sc.nextInt();
        }
        Arrays.sort(n);
        System.out.println((n[0]==5&&n[1]==5&&n[2]==7) ? "YES" : "NO");
    }

}
