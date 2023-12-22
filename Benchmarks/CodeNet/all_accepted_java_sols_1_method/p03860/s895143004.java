

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[]res=in.nextLine().split(" ");
        for(int i=0;i<res.length;i++)
            System.out.print(res[i].charAt(0));
    }
}
