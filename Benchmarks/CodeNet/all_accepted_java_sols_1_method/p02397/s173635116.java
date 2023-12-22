import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            int[] x = new int[3000];
            int[] y = new int[3000];
            
            for(int i = 0; i < 3000; i++){
                x[i] = scan.nextInt();
                y[i] = scan.nextInt();
                
                if(x[i] == 0 && y[i] == 0)
                break;
                
                if(x[i] < y[i])
                System.out.println(x[i] + " " + y[i]);
                else
                System.out.println(y[i] + " " + x[i]);
            
        }
    }
}
