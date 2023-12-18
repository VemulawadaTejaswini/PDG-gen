import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = 8;
        if(x<800){
            result = 7;
        }else if(x<1000){
            result = 6;
        }else if(x<1200){
            result = 5;
        }else if(x<1400){
            result = 4;
        }else if(x<1600){
            result = 3;
        }else if(x<1800){
            result = 2;
        }else if(x<2000){
            result = 1;
        }
        System.out.println(result + "級");
    }
}
