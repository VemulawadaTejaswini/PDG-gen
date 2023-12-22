import java.io.*;
import java.util.*;
public class Main
{
  public static void main (String[] args)
  {
    int count =0;
    Scanner reader = new Scanner(System.in);
    int a=reader.nextInt();
for(int i=0;i<3;i++){
if(a%2==1)
count++;
  a=a/10;
  }
  System.out.print(count);
}
}