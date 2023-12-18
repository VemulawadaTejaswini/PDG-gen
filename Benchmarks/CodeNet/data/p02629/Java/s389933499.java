import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();
        int amari;
        int sho = n;
        String charlist = "zabcdefghijklmnopqrstuvwxy";
        List<Character> anslist = new ArrayList<>();
        while(sho > 0){
            amari = sho % 26;
            sho = sho / 26;
            anslist.add(charlist.charAt(amari));
            if(amari == 0){
                sho -= 1;
            }
        }
        for(int i = anslist.size() - 1; i >= 0; i--){
            System.out.print(anslist.get(i));
        }
    }
}
