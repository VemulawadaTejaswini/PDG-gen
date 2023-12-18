import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int val = sc.nextInt();
        int h = val / 3600;
        int m = val % 3600 / 60;
        int s = val % 60;
        System.out.println(h + ":" + m + ":" + s);
    }
}
