import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = 0;
        for(int l = i;l <= j;l++){
            if(l/1000==l%10*10+l%100/10) k++;
        }
        System.out.println(k);
    }
}