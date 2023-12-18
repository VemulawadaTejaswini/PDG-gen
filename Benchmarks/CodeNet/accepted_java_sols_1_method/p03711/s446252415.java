import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int y = scan.nextInt();
        int xg = 1;
        int yg = 1;
        switch(x){
            case 2:
                xg = 3;
                break;
            case 4:
                xg = 2;
                break;
            case 6:
                xg = 2;
                break;
            case 9:
                xg = 2;
                break;
            case 11:
                xg = 2;
                break;
        }
        switch(y){
            case 2:
                yg = 3;
                break;
            case 4:
                yg = 2;
                break;
            case 6:
                yg = 2;
                break;
            case 9:
                yg = 2;
                break;
            case 11:
                yg = 2;
                break;
        }
        if(xg == yg){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}