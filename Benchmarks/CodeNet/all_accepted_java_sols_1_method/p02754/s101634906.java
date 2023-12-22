import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
       
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(), blue = sc.nextLong(), red = sc.nextLong();
        
        long count = n / (blue + red);
        long rem = n % (blue + red);
        
        if(blue == 0){
            System.out.println(blue);
        } else if(n < (blue + red)) {
            if(n>blue){
                System.out.println(blue);
            } else {
                System.out.println(n);
            }
        } else {
            if(rem > blue){
                System.out.println((count * blue) + blue);
            } else {
                System.out.println((count * blue) + rem);    
            }
        }
    }
}
