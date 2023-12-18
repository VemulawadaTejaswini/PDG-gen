/*
    Author: Anthony Ngene
    Created: 26/09/2020 - 13:32
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        StringBuilder rs = new StringBuilder();
        for (int i = 0; i < n; i++) rs.append("ACL");
        System.out.println(rs);
    }
}
