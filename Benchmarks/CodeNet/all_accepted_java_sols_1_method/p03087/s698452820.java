import java.util.*;

public class Main {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N    = scan.nextInt();
        int Q    = scan.nextInt();
        String S = scan.next();

        int[] acCount = new int[N];
        String subStr;


        for(int i = 0; i < N; i++) {

            if(i == 0){

              acCount[i] = 0;

            }else{

                subStr =S.substring(i-1,i+1);
                //System.out.println(subStr);

                if(subStr.equals("AC")){

                    acCount[i] = 1;
                }

                acCount[i] = acCount[i-1] + acCount[i];
            }

            //System.out.println(i+1 + "文字目まで:" + acCount[i]);
        }



        int[] ans = new int[Q];
        for(int i = 0; i < Q; i++) {

            int l    = scan.nextInt();
            int r    = scan.nextInt();

            ans[i] = acCount[r-1] - acCount[l-1];
        }



        for(int i = 0; i < Q; i++) {

            System.out.println(ans[i]);
        }



    }

}