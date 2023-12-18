import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int num;
        for(int i=1; i<= x; ++i){
		if(output(i) != 0){
            System.out.printf(" %d", output(i));
		}
        }

        System.out.printf("\n");

    }
    private static int output(int i){
        if((i % 3) == 0){
            return i;
        }
        else if((i % 10) == 3){
            return i;
        }
        else if( i>10 && output(i/10) != 0){
            return i;
        }
        else{
            return 0;
         }
    }
}