import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n%2!=0){
            System.out.println("No");
        }else {
            char[] c = sc.next().toCharArray();
            for (int i=0; i<n/2; i++){
                if (c[i]!=c[i+n/2]){
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("Yes");

        }

    }
}