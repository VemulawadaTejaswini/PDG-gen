import java.util.*;
import java.util.stream.*;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,taro,hanako;
        taro = 0;
        hanako = 0;
        n = input.nextInt();
        String a,b;
        for (int i = 0; i < n; i++){
            a = input.next();
            b = input.next();
            int key = a.compareTo(b);
            if (key > 0){
                taro += 3;
            } else if (key < 0){
                hanako += 3;
            } else {
                taro += 1;
                hanako += 1;
            }
        }
        System.out.printf("%d %d\n",taro,hanako);
    }
}
