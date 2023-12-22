import java.io.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.io.*;

class Main
{
 public static void main(String[] args) throws IOException
 {
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
  String[] str = br.readLine().split(" "); 
  int x=Integer.parseInt(str[0]);
  int y=Integer.parseInt(str[1]);
  
  System.out.println(x*y + " " + (2*x+2*y));
 }
}