import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int start = Integer.parseInt(str[0]);
        int end = Integer.parseInt(str[1]);
        int num = Integer.parseInt(str[2]);

        System.out.println(Function(start,end,num));
        sc.close();
    }

    public static int Function(int start, int end, int num){
        int ans = 0;
        for(;start <= end; ){
            if( num%start == 0 ) ans++;
            start++;
        }
        return ans;
    }

}