import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int h = s/3600;
        int m = (s-h*3600)/60;
        int s1 = s-h*3600-m*60;
        System.out.println(h+":"+m+":"+s1);
    }
}

