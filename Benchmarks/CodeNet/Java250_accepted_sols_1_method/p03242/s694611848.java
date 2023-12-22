import java.util.*;

public class Main {

    static final int MOD = 1000000007;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char arr[] = sc.next().toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]=='9')arr[i]='1';
            else arr[i] = '9';
        }
        for(Character c:arr) System.out.print(c);
        System.out.println();

    }
}
