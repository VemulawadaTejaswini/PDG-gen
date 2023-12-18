import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int in = s.nextInt();
        int sum = 0;       
        while(in!=0){
            for(int i = 1 ; i<= in/2 ; i++){
                if(in%i == 0)
                    sum += i;               
            }
            if(sum==in)            
                System.out.println("perfect number");
            if(sum > in)
                System.out.println("abundant number");
            if(sum < in) 
                System.out.println("deficient number");            
            in = s.nextInt();
            sum = 0;
        }
    }
}