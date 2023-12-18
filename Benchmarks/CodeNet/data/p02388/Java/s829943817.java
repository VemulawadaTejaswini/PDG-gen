import java.util.Scanner;

public class ITP1_1_B {
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
            int inputnum = Integer.parseInt(line[0]);
            int ans = pow(inputnum,3);
            System.out.println(ans);
        }
    }
}


