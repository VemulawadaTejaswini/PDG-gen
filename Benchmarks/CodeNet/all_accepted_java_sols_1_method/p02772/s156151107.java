import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input : N A1 A2 ... An
        // An がすべて、奇数か、偶数かつ 3 か 5 で割り切れるなら APPROVED
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String retStr = "APPROVED";
        for(int i = 0; i < num; i++){
            int testNum = sc.nextInt();
            if(testNum % 2 == 0 && (testNum % 3 != 0 && testNum % 5 != 0)){
                retStr = "DENIED";
            }
        }
        System.out.println(retStr);
    }
}
