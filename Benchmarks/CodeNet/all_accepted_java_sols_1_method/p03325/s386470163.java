import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.next());
        int count = 0;
        for(int i = 0; i < N; i++){
            int s = Integer.parseInt(sc.next());
            while(s % 2 == 0){
                s = s/2;
                count++;
            }
        }
       
        System.out.println(count);
    
    }
}