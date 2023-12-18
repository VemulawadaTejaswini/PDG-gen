import java.util.Scanner;
import java.lang.Character;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] str = new String[1000];
        int i = 0;
        while (true) {
            if(scan.hasNext()==false)break;
            str[i] = scan.next();
            for (int j = 0; j < str[i].length(); j++) {
                if (Character.isUpperCase(str[i].charAt(j))) {
                    str[i]=str[i].substring(0,j)+str[i].substring(j,j+1).toLowerCase()+str[i].substring(j+1);
                } else {
                    str[i]=str[i].substring(0,j)+str[i].substring(j,j+1).toUpperCase()+str[i].substring(j+1);
                }
            }
            i++;
        }
        for (int k = 0; k < i-1; k++) {
            System.out.printf("%s ", str[k]);
        }
        System.out.printf("%s\n", str[i-1]);
    }
}
