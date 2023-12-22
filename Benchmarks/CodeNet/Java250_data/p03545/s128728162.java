import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();
        sc.close();
        int d = line % 10;
        int c = (line / 10) % 10;
        int b = (line / 100) % 10;
        int a = (line / 1000) % 10;

        boolean endFlag = false;
        for(int i = 0; i <=1; i++){
            for(int j = 0; j <=1; j++){
                for(int k = 0; k <=1; k++){
                    int tmp = calc(a,b,i);
                    tmp = calc(tmp,c,j);
                    tmp = calc(tmp,d,k);
                    if(tmp == 7){
                        System.out.println(a + op(i) + b + op(j) + c + op(k) + d + "=7");
                        endFlag = true;
                        break;
                    }
                }
                if(endFlag){
                    break;
                }
            }
            if(endFlag){
                break;
            }
        }

    }

    private static String op(int i) {
        if(i == 0){
            return "+";
        }
        return "-";
    }

    private static int calc(int a, int b, int i) {
        if(i == 0){
            return a + b;
        }
        return a - b;
    }

}