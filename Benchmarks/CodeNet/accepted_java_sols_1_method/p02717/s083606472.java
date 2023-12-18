
import java.util.*;
import java.io.*;

import static java.lang.Character.isUpperCase;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int X =  in.nextInt();
        int Y =  in.nextInt();
        int Z =  in.nextInt();


        int t=0;

        t=X;
        X=Y;
        Y=t;
        t=X;
        X=Z;
        Z=t;
        System.out.println(X);
        System.out.println(Y);
        System.out.println(Z);

 }

    }


    





