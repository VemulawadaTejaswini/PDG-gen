import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int day = in.nextInt();
        int number = in.nextInt();
        int sum = 0;
        for(int i = 0; i < number; i++){
            sum += in.nextInt();
        }
        if(sum<=day){
            System.out.print(day-sum);
        }
        else{
            System.out.print(-1);
        }
    }
 
}