import java.util.*;
import java.io.*;
class Main {
public static void main(String[] args) {
Scanner in = new Scanner(System.in);
int a = in.nextInt(), b = in.nextInt();
PrintStream o = System.out;
if(a > b) o.println("a > b");
else if(a<b)  o.println("a < b");
else  o.println("a == b");
}}