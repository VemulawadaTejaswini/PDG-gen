import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner1 = new Scanner(System.in);
        String str = scanner1.nextLine();

        int ind1 = str.indexOf("C");
        String str2 = str.substring(ind1+1);
        int ind2 = str2.indexOf("F");

        if(ind1>=0 && ind2 >= 0)
            System.out.print("Yes\n");
        else
            System.out.print("No\n");

    }
}
