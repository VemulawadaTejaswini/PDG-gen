
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();

        if(A==B && B==C && C==A || A!=B && B!=C && C!=A)
        {
            System.out.println("No");
        }
        else
            {
                System.out.println("Yes");
            }





    }


 }











