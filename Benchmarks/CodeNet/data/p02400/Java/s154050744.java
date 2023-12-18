package aizuc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String data[] = reader.readLine().split(" ");
        double r = Double.parseDouble(data[0]);
        String c;
        String a;
        
        c = (String.format("%.6f", (double)2*(double)r*(double)Math.PI));
        a = (String.format("%.6f", (double)r*(double)r*(double)Math.PI));

        sb
                .append(c)
                .append(" ")
                .append(a)
                .append("\n");
        System.out.println(sb);
    }
}