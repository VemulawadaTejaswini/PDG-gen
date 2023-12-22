import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner InData = new Scanner(System.in);
        int a = InData.nextInt();
        int b = InData.nextInt();
        int c = InData.nextInt();
        int Shang;
        int Yu;
        int Acc = 0;
        for(int n = a; n<=b; n++){
            Shang = c/n;
            Yu = c%n;
            if(Shang != 0 && Yu == 0){
                Acc++;

            }

        }
        System.out.println(Acc);
    }
}