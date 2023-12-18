import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int count = 0;
        int count2 = 0;
        int[] b = new int[a];
        for(int i = 0;i<a;i++){
            b[i] = sc.nextInt();
        }
        int flag = 0;
        while(flag == 0){
            for(int j = 0;j<a;j++){
                if(b[j] % 2 == 0){
                    b[j] = b[j]/2;
                    count2++;
                }
                if(count2 == a){
                    count++;
                    count2 = 0;
                }
            }
            for(int j = 0;j<1;j++){
                if(b[j] % 2 != 0){
                    flag++;
                }
            }
            if(flag != 0){
                break;
            }
        }
        System.out.println(count);
    }
}