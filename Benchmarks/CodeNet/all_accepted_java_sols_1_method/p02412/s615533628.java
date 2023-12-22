import java.util.Scanner;

//import jdk.internal.org.jline.utils.InputStreamReader;

//import java.io.*;

public class Main{
        public static void main(final String[] args){
            Scanner scanner = new Scanner(System.in);
            while(true){
                int n = scanner.nextInt();
                int x = scanner.nextInt();
                if(n + x == 0){
                    break;
                }
                int flag = 0;
                for(int i = 1; i <= n; i++){
                    
                    for(int j = i+1; j <= n; j++){
                        //System.out.println(i +" "+ j);
                        for(int k = j+1; k <= n; k++){
                            int answer = i + j + k;
                            //System.out.println(answer);
                            if(answer == x){
                                flag++;
                            }
                            //System.out.printf("%d %d %d\n", i, j, k);
                            
                        }
                    }
                    
                }
                System.out.println(flag);
            }
            scanner.close();
        }
         

}
