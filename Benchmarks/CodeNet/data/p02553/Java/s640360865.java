import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        long C = sc.nextInt();
        long D = sc.nextInt();
        long ancs[] = new long[4];
    
        ancs[0] = A*C;
        ancs[1] = A*D;
        ancs[2] = B*C;
        ancs[3] = B*D;

        long max = ancs[0];
        for(int i = 0;i < 4;i++){
            if(max < ancs[i]){
                max = ancs[i];
            }
        }
        
        System.out.println(max);
    }
}