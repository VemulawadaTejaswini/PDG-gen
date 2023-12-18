import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int max;
        int min;
        if(x < y){
            min = x;
            max = y; 
        } 
        else{
            min = y;
            max = x;
        }
        while(max % min != 0){
            int hold = min;
            min = max % min;
            max = hold;
        }
        System.out.println(min);
    }
}
