import java.util.*;
 
public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int Y = sc.nextInt();
        sc.close();

        loop: for(int i = 0; i  <= 2000; i++){
            for(int j = 0; j <= 2000-i; j++){
                int k = N - i - j;
                if(k < 0)
                    continue loop;
                if(10000*i + 5000*j + 1000*k == Y){
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }
}