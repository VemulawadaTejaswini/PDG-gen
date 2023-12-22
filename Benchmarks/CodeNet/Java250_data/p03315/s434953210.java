import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        byte count = 0;
        Scanner sc = new Scanner(System.in);
        String inputString = sc.nextLine();
        if(inputString.charAt(0) == '+'){
            count++;
        } else{
            count--;
        }
        if(inputString.charAt(1) == '+'){
            count++;
        } else{
            count--;
        }
        if(inputString.charAt(2) == '+'){
            count++;
        } else{
            count--;
        }
        if(inputString.charAt(3) == '+'){
            count++;
        } else{
            count--;
        }
        System.out.println(count);
    }
}