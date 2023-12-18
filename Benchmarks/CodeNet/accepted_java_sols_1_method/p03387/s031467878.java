import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = Math.max(a,Math.max(b,c));
        int count = 0;
        int tmp;
        if(a != max){
            tmp = (max - a) / 2;
            count += tmp;
            a += tmp * 2;
        }
        if(b != max){
            tmp = (max - b) / 2;
            count += tmp;
            b += tmp * 2;
        }
        
        if(c != max){
            tmp = (max - c) / 2;
            count += tmp;
            c += tmp * 2;
        }
        switch(max * 3 - a - b - c){
            case 1:
                count += 2;
                break;
            case 2:
                count += 1;
                break;
            default:
                break;
        }
        System.out.println(count);
    }
}