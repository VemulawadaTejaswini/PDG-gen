import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String n = sc.next();
        int sum = 0;
        for(char c: n.toCharArray()){
            sum += Character.getNumericValue(c);
        }
        if (sum%9 == 0 && sum != 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }    
}