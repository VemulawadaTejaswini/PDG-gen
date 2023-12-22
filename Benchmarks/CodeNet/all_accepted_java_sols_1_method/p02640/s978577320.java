import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        boolean b = false;
        for (int i=0;i<=x&&!b;i++){
            if (2*i+4*(x-i)==y)b=true;
        }
        if (b){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }
    }
}