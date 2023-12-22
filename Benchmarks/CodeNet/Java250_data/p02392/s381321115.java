//Range
import java.util.Scanner;

class Main {
    public void cubic() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        String out = "No";
        if (a < b) {
            if(b < c) {
                out = "Yes";
            }
        }
                                        
        System.out.println(out);
    }
    
    public static void main(String[] args){
    new Main().cubic();
    }
}