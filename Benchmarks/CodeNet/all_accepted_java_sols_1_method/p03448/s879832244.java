import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        int c = Integer.parseInt(sc.nextLine());
        int x = Integer.parseInt(sc.nextLine());

        int count = 0;
        for(int i = 0;i<=a;i++){
            for(int j = 0;j<=b;j++){
                for(int k = 0;k<=c;k++){
                    if(x == 500*i+100*j+50*k){
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}