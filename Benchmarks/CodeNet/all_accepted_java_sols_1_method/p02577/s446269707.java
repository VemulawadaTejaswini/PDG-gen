import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String strn = sc.next();
        sc.close();
        String  str[] = strn.split("");

        int sum = 0;
        for(int i = 0; i<strn.length(); i++){
            sum += Integer.parseInt(str[i]);
        }
        String ans = "No";
        if(sum%9==0){
            ans = "Yes";
        }
        System.out.println(ans);
    }
}
