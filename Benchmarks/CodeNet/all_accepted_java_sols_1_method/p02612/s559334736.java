
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
 
public class Main {    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n % 1000 != 0){
            System.out.println(1000 - (n % 1000));
        }else{
            System.out.println(n % 1000);
        }
    }
}

