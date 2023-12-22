import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[3];
        int last = Integer.MIN_VALUE;
        String result = "Yes";
        
        for(int i = 0; i <3; i++){
            int temp = input.nextInt();
            if(temp > last){
                last=temp;
            } else {
                result = "No";
                break;
            }
        }
        System.out.println(result);

    }}
