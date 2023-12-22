//Small, Large, or Equal
import java.util.Scanner;

class Main {
    public void cubic() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String out = "a > b";
        if (a == b ) {
            out = "a == b";
        }else if(a < b) {
            out = "a < b";
        }


                                        
        System.out.println(out);
    }
    
    public static void main(String[] args){
    new Main().cubic();
    }
}