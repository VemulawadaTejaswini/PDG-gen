import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String result = null;

        if(a*b%2 !=0){
            result = "Odd";
        }else{
            result ="Even";
        }
        System.out.println(result);

    }
}
