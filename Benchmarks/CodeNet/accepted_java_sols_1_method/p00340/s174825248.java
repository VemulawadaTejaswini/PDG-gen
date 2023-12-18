
import java.util.Scanner;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int e1 = sc.nextInt();
            int e2 = sc.nextInt();
            int e3 = sc.nextInt();
            int e4 = sc.nextInt();
            
            if(e1==e2&&e3==e4 || e1==e3&&e2==e4 || e1==e4&&e2==e3){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}

           
