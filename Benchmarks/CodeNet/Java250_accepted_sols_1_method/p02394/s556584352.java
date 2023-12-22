import java.util.*;

class Main {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        int sx = input.nextInt();
        int sy = input.nextInt();
        int cx = input.nextInt();
        int cy = input.nextInt();
        int cn = input.nextInt();
        if(cx+cn > sx || cy+cn > sy || cx-cn < 0 || cy-cn < 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }
}