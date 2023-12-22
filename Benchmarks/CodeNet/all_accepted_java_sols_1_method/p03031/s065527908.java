import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] sw = new int[M][];
        for(int i = 0; i < M; i++) {
            sw[i] = new int[sc.nextInt()];
            for (int j=0; j<sw[i].length; j++){
                sw[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[M];
        for (int i=0; i<M; i++){
            p[i] = sc.nextInt();
        }
        sc.close();

        int count = 0;

        for (int i=0; i < Math.pow(2, N); i++){
            String str = Integer.toBinaryString(i);

            str = String.format("%10s", str);
            str.replace("","0");

            String[] strArray = str.split("");

            int num=0;

            for (int j=0; j<M; j++){

                int t = 0;
                for (int k=0; k<sw[j].length; k++){
                    if(strArray[10-sw[j][k]].equals("1")){
                        t++;
                    }
                }

                if(t%2 != p[j]){
                    break;
                }else{
                    num++;
                }
            }
            if (num == M){
                count++;
            }
        }

        System.out.println(count);


    }
}
