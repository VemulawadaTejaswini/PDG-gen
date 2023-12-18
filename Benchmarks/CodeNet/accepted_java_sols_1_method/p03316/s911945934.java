import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int tmp = a;
        int answ = 0;
        for(int i =0;i<String.valueOf(a).length();i++){
            answ += tmp%10;
            tmp /= 10;
        }
        if(a%answ == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}