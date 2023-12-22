import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int count = 0;
        for(int i = 0; i < x; i++){
            int y = sc.nextInt();
            if(y%2 == 0 && y != 2){
                continue;
            }
            if(check(y)){
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean check(int y){
        int z = (int)Math.sqrt(y);
        for(int j = 2; j <= z; j++){
            if(y%j == 0){
                return false;
            }
        }
        return true;
    }
}