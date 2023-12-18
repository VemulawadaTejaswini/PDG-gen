import java.io.IOException;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) throws IOException, StackOverflowError{
        Scanner scanner = new Scanner(System.in);
        while(true){
        	//first line
            int r = scanner.nextInt(); // 0 <= r <= 10
            int c = scanner.nextInt(); //0 <= c <= 10000
            //separater
            if(r == 0 && c == 0){
                break;
            }
            int[] a = new int[c];
            for(int i = 0; i < r; ++i){
                for(int j = 0; j < c; ++j){
                    //In this case I considered 01 as binary digit
                    a[j] = a[j] * 2 + scanner.nextInt();
                }
            }
            //Total number of upside down is 2 to r
            int bitRow = 1 << r; // max 2^10 -> 1024
            int answer = 0;
            //Upside down row is equal to 1 in binary digit
            for(int i = 0; i < bitRow; ++i){
                int thisAnswer = 0;
                //for each column
                //Total number of columns is at most 10000
                for(int j = 0; j < c; ++j){
                    //i and column XOR computes the number of heads Senbei
                    int currentBit = Integer.bitCount(a[j] ^ i);
                    //r - currentBit means the number of tail Senbei We need larger one
                    thisAnswer += Math.max(currentBit, r - currentBit);
                }
                answer = Math.max(answer, thisAnswer);
            }
            System.out.println(answer);
        }
    }
}