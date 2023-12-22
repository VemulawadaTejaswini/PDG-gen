
import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x,y =1;
        while(true){
            x = sc.nextInt();
            y = sc.nextInt();
            if(x>y){
                int temp = x;
                x=y;
                y=temp;
                System.out.println(x+" "+y);
            }
            else if(x==0 && y==0){
                break;
            }
            else{
                System.out.println(x+" "+y);
            }
        }
    }
}
