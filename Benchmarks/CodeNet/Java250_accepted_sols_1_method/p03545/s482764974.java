import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        String ABCD = sc.next();
        sc.close();

        String[] strArray = ABCD.split("");
        int[] abcd = new int[4];
        int sum = 0;

        for(int i = 0; i < 4; i++) {

            abcd[i] = Integer.parseInt(strArray[i]);
            sum += abcd[i];
        }

        int[] trueUseNum = new int[3];

        for (int i=0; i<(Math.pow(2,3)); i++) {

            //負の数として使用する
            int use = 0;
            int[] useNum = new int[3];

            for (int j=0; j<3; j++) {

                if ((1&i>>j) == 1) {

                    use += abcd[j+1];
                    useNum[j] = 1;
                    } else {

                        useNum[j] = 0;
                    }

            }

            if(sum - use - use == 7) {

                trueUseNum = useNum;
                break;
            }
        }

        System.out.print(abcd[0]);

        for (int i = 0; i < 3 ;i++) {

            if(trueUseNum[i] == 0) {

                System.out.print( "+" + abcd[i + 1]);
            } else {

                System.out.print( "-" + abcd[i + 1]);
            }
        }

        System.out.print("=7");
    }

}