
import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int index;

        Scanner scan = new Scanner(System.in);
        index = Integer.valueOf(scan.next()) - 1;
        int[] b = new int[index];

        for(int i=0;i<index; i++){
            b[i] = Integer.valueOf(scan.next());
        }

        int answer = b[0];
        for(int i=1;i<index; i++) {
               //自分が一番小さい
               if(b[i] <= b[i-1]){
                   answer += b[i];
               }
               //左側が一番小さい
               else if(b[i] > b[i-1]){
                   answer += b[i-1];
               }
        }
        answer += b[index-1];

        System.out.println(answer);

    }
}
