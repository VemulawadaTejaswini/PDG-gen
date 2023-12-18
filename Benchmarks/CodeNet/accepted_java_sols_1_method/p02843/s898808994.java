import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int x = Integer.parseInt(sc.next());
        
        if((x/100)*5 >= x % 100){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}