import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int ans;

        while(!str.equals("0")){
            String[] num = str.split("");
            ans = 0;
            for(int i=0;i<str.length();i++){
                int a = Integer.valueOf(num[i]);
                ans += a;
            }
            System.out.println(ans);
            str=scn.nextLine();

        }



        scn.close();


    }


}
