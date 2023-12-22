import java.util.Scanner;

public class Main {
    public static int pow(int num,int cnt){
        int ans = num;
        while(1 < cnt--){
            ans *= num;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while( sc.hasNext() ){
            String[] line = sc.nextLine().split(" ");
            int innum = Integer.parseInt(line[0]);
            int ans = pow(innum,3);
            System.out.println(ans);
        }
    }
}