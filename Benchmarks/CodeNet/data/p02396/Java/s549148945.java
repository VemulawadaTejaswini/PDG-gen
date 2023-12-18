import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int temp;
        int index = 1;
        while(true){
            temp = input.nextInt();
            if(temp == 0)break;
            System.out.println("Case " + index + ": " + temp);
            index++;
        }

    }}
