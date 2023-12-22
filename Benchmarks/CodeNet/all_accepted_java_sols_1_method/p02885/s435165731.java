import java.util.*;
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int b = sc.nextInt();
        int ret = s - b * 2 < 0 ? 0 : s - b * 2; 
        System.out.println(ret);
        sc.close();
    }
}

