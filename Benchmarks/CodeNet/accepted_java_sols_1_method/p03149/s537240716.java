import java.util.*;
import java.io.*;

/*
   AtCoder contest code
   coder : yoichidon
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        int N2 = sc.nextInt();
        int N3 = sc.nextInt();
        int N4 = sc.nextInt();

        if(   (N1==1 || N2==1 || N3==1 || N4==1)
           && (N1==9 || N2==9 || N3==9 || N4==9)
           && (N1==7 || N2==7 || N3==7 || N4==7)
           && (N1==4 || N2==4 || N3==4 || N4==4)
        ) System.out.println("YES");
        else System.out.println("NO");

    }
}
