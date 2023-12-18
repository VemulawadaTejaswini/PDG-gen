import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean atcodeerIsHonest = sc.next().equals("H");
        boolean atcodeersState = sc.next().equals("H");
        System.out.println(atcodeerIsHonest==atcodeersState ? "H" : "D");
    }
}