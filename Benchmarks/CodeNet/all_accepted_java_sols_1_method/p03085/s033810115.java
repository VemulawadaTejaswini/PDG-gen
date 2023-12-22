import java.io.*;
import java.util.*;

class Main
{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char C = sc.next().charAt(0);
    if (C == 'A') System.out.println("T");
    else if (C == 'T') System.out.println("A");
    else if (C == 'C') System.out.println("G");
    else System.out.println("C");
  }
}
