import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // input N H1 H2 ... Hn
        // i < j なる Hi,Hj について、 Hi >= Hj の関係が連続する最大の個数を出力せよ
        Scanner sc = new Scanner(System.in);
        int numN = sc.nextInt();
        int beforeNum = sc.nextInt();
        int continueNum = 0;
        int maxContinueNum = 0;
        for(int i = 1; i < numN; i++){
            int nextNum = sc.nextInt();
            if(nextNum <= beforeNum){
                continueNum++;
            } else {
                if(maxContinueNum < continueNum){
                    maxContinueNum = continueNum;
                }
                continueNum = 0;
            }
            beforeNum = nextNum;
        }
        if(maxContinueNum < continueNum){
            maxContinueNum = continueNum;
        }
        System.out.println(maxContinueNum);
    }
}
