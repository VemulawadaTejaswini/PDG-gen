import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        int rest;
        while(true){
            rest = x % y;
            if(rest == 0){
                System.out.println(y);
                break;
            }
            x = y;
            y = rest;
        }
        
    }
}
