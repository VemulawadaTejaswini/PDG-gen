import java.util.*;

public class Main {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    int a,b,total;
    while(scan.hasNextInt()){
    a= scan.nextInt();
    b= scan.nextInt();
    total = a+b;
    int i=1;
    while(true){
        total = total /10;
        if (total == 0){
           System.out.println(i);
           break;
        }
        i++;
    }
    }
    
    
    }
}