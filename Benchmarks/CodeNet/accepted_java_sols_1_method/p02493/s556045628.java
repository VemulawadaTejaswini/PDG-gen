import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(in.readLine());
        String[] numbers = in.readLine().split(" ");

        for(int i=length-1; ; i--){
            System.out.print(numbers[i]);
            if(i==0){
                System.out.println();
                break;
            }
            else{
                System.out.print(" ");
            }
        }
    }
}