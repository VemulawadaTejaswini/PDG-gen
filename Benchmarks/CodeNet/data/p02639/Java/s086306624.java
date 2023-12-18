import java.util.Scanner;

public class FiveVariables {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] x = new int[5];
        for(int i=0; i<5; i++){
            x[i] = read.nextInt();
            if(x[i] == 0){
                System.out.println(i+1);
                break;
            }
        }
    }
}
