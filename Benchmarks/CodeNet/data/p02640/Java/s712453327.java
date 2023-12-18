import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        int min = x*2;
        int max = x*4;
        
        String output = "Yes";
        
        if(y%2 != 0) output = "No";
        if(y < min || y > max) output= "No";
        
        System.out.println(output);
    }
}
