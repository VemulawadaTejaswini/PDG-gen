import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        boolean flag = true;

        while(number != 0){
            if((number % 10) == 7){
                flag = false;
            }
            number = number/10;
        }

        if(flag==true)System.out.println("No");
        if(flag==false)System.out.println("Yes");
    }
}