import java.util.Scanner;
import java.util.Arrays;

class Main{
    public static void main(String args[]){
        int dataSet;
        Scanner in = new Scanner(System.in);
        dataSet = in.nextInt();
        for(int i = 0; i < dataSet; i++){
            int[] e = new int[3];
            for(int j = 0; j < 3; j++){
                e[j] = in.nextInt();
            }
            Arrays.sort(e);
            if(e[0] * e[0] + e[1] * e[1] == e[2] * e[2]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}