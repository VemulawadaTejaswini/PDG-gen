import java.util.Scanner;

public class Main{
    public static void main(String[] arg){
        int x, y, box;
        Scanner scan = new Scanner(System.in);
        for(;;){
        	x = scan.nextInt();
        	y = scan.nextInt();
            if(x == 0 && y == 0) break;
            if(x <= y){
                System.out.println(x +" "+ y);
            }else{
                System.out.println(y +" "+ x);
            }

        }
        scan.close();
    }
}
