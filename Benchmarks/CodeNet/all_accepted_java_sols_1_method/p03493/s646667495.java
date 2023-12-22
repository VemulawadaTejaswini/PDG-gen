import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        int count = 0;
        for(String s: String.valueOf(input).split("")){
            if(s.equals("1")){
                count++;
            }
        }
        System.out.println(count);
    }
}