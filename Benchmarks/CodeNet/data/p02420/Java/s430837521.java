import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            String str = sc.next();
            if(str.equals("-")){
                break;
            }
            int shuf = sc.nextInt();
            int[] h = new int[shuf];
            for(int i = 0; i < shuf; i++){
                h[i] = sc.nextInt();
            }
            for(int i = 0; i < shuf; i++){
                str = str.substring(h[i]) + str.substring(0, h[i]);
            }
            System.out.println(str);
        }
    }
}
