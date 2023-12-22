import java.io.*;
import java.util.Scanner;


public class Main{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
        do{
            String line1 = scanner.next();
            String line2 = scanner.next();

            int n = Integer.parseInt(line1);
            int x = Integer.parseInt(line2);
            if(n == 0 && x == 0){
                break;
            }
            int count = 0;

            for(int i = 1;i < n-1;i++){
                for(int j = i+1;j < n; j++){
                    for(int k = j + 1;k <= n;k++){
                        if(i + j + k == x){
                            count++;
                        }
                    }
                }
            }
            System.out.println(count);
        }while(true);
       
    }
}


