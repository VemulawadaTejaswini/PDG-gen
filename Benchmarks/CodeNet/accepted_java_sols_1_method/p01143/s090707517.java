import java.util.Scanner;


public class Main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int N=0,M=0,P=0;
        int[] voteNum;

        while(true){
            N=s.nextInt();
            M=s.nextInt();
            P=s.nextInt();

            if(N==0) break;

            voteNum = new int[N+1];
            int totalNum=0;

            for(int i=1;i<N+1;i++){
                voteNum[i]=s.nextInt();
                totalNum+=voteNum[i];
            }

            int money=totalNum*100;
            money= money*(100-P);
            int dividend;
            if(voteNum[M]!=0) {
                dividend = money / (voteNum[M]*100);
            } else{
                dividend=0;
            }

            System.out.println(dividend);

        }
    }
}