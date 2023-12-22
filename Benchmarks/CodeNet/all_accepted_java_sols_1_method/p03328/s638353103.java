import java.util.*;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int[] s = new int[999];
        for(int i = 0; i < 999; i++){
            if(i == 0){
                s[i] = 1;
            } else {
                s[i] = s[i-1]+(i+1);
            }
        }
        int diff = b-a;

        System.out.println(s[diff-2] - a);
    }
}