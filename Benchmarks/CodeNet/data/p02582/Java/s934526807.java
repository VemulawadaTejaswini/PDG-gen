import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int ans = 0;

        if(S.equals("RRR")){
            ans =3;
        }else if(S.indexOf("R") == -1){
            ans = 0;
        }else{
            if(S.indexOf("RR") == -1){
                ans = 1;
            }else{
                ans = 2;
            }
        }
        System.out.println(ans);
    }
}
