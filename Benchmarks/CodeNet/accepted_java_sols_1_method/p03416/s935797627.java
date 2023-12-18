import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int ans =0;
        for (Integer i =A;i<=B;i++){
            String[] s = i.toString().split("");
            if (s[0].equals(s[4]) && s[1].equals(s[3])){
                ans++;
            }
        }
        System.out.println(ans);
    }
}