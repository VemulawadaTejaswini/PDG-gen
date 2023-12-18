import java.util.*;
import java.lang.*;
import java.io.*;

class Main{
 public static void main (String[] args) throws java.lang.Exception
 {
 InputStreamReader is = new InputStreamReader(System.in);
 BufferedReader br = new BufferedReader(is);
 Scanner scan = new Scanner(System.in);
 int su = scan.nextInt();
 int menseki = su * su;
 int nagasa = su * 2 + su * 2;
 System.out.println(menseki+""+ nagasa);
 }
}
