import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String word = scn.nextLine();
        int ans = 0;

        while (scn.hasNext()) {
            String check = scn.next();

            check.replace(".","");
            check.replace("?","");
            check.replace("!","");
            if(check.equalsIgnoreCase(word)){
                ans +=1;
            }

        }
        System.out.println(ans);

        scn.close();


    }

}
