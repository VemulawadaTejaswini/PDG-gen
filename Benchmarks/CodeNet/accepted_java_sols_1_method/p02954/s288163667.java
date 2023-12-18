import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        int length = S.length();
        int[] ans = new int[length];

        int rightMost = S.length() - 1;
        for(int i = length - 1; i >= 0; i--){
            if(S.charAt(i) == 'L'){
                rightMost = i;
            }
            if(S.charAt(i) == 'R'){
                if((rightMost - i) % 2 == 1){
                    ans[rightMost - 1] += 1;
                }else{
                    ans[rightMost] += 1;
                }
            }
        }

        int leftMost = 0;
        for(int i = 0; i < length; i++){
            if(S.charAt(i) == 'R'){
                leftMost = i;
            }
            if(S.charAt(i) == 'L'){
                if((i - leftMost) % 2 == 1){
                    ans[leftMost + 1] += 1;
                }else{
                    ans[leftMost] += 1;
                }
            }
        }

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i = 0; i < length; i++){
            bw.write(String.format("%d ", ans[i]));
        }
        bw.flush();

    }
}
