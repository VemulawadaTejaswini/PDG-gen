import java.util.Scanner;

public class Main {
    static Scanner stdIn = new Scanner(System.in);
    public static void main(String[] args){
        int n = stdIn.nextInt();
        int k = stdIn.nextInt();
        int[] temp = new int[k];
        int startIdx = 0;
        for(int i=0; i<n; i++){
            if(i < k){
                temp[i] = stdIn.nextInt();
            }else{
                int x = stdIn.nextInt();
                if(temp[startIdx] < x){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
                temp[startIdx] = x;
                startIdx = (startIdx + 1) % k;
            }
        }
    }
}
