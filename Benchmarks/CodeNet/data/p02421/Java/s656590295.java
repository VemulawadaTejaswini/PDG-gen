import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(), tapo=0, hapo=0;
        for (int i=0; i<n; i++){
            String taro = s.next();
            String hana = s.next();
            int co=taro.compareTo(hana);
            if (co>0) tapo += 3;
            else if (co<0) hapo += 3;
            else{
                tapo++;
                hapo++;
            }
        }
        System.out.println(tapo+" "+hapo);
    }
}
