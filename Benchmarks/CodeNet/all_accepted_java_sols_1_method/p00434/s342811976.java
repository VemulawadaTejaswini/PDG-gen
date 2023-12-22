import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int submit[] = new int[31];
        int i;
        Arrays.fill(submit,0);
        
        for(i=1; i<=28; i++){
            submit[sc.nextInt()] = 1;
        }

        for(i=1; i<=30; i++){
            if(submit[i] == 0){
                System.out.println(i);
            }
        }

    }
}