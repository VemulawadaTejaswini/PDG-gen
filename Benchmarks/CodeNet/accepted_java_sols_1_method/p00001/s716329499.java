
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    
        int t[] = new int[10];
        t[0] =  scanner.nextInt();
        t[1] =  scanner.nextInt();
        t[2] =  scanner.nextInt();
        t[3] =  scanner.nextInt();
        t[4] =  scanner.nextInt();
        t[5] =  scanner.nextInt();
        t[6] =  scanner.nextInt();
        t[7] =  scanner.nextInt();
        t[8] =  scanner.nextInt();
        t[9] =  scanner.nextInt();
        
        
        for(int i=0; i<9; i++){
             for(int j=0; j<9-i; j++){
                 if( t[j] < t[j+1]) {
                    int temp = t[j];
                    t[j] = t[j+1];
                    t[j+1] = temp;   
                 }
             }
        }
        for(int i=0; i<3; i++){
            System.out.println(t[i]);
    }
    
        

    }
}


