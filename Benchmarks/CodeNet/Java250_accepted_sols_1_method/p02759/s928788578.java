import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        int j;
        if (i%2==0){
            j = i/2;
        }else{
            j = (i+1)/2;
        }
        System.out.println(j);
    }
    
}