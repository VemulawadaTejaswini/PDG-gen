import java.util.Scanner;
import java.util.*;
import java.lang.*; 
import java.util.regex.Pattern;
import java.text.DecimalFormat;
import java.util.stream.IntStream;
public class Main{    
public static void main(String[] args)
{     
Scanner scanner=new Scanner(System.in);
String s=scanner.next();
StringBuilder s1 = new StringBuilder(s);
int count=0;
int count1=0;
for(int i=1;i<s.length();i++)
{
  if(s1.charAt(i)==s1.charAt(i-1)){
    count++;
    if(s1.charAt(i)=='0')s1.setCharAt(i, '1');
    else if(s1.charAt(i)=='1')s1.setCharAt(i, '0');}
}
StringBuilder s2 = new StringBuilder(s);
for(int i=s.length()-1;i>0;i--)
{
  if(s2.charAt(i)==s2.charAt(i-1)){
    count1++;
    if(s2.charAt(i-1)=='0')s2.setCharAt(i-1, '1');
    else if(s2.charAt(i-1)=='1')s2.setCharAt(i-1, '0');}
}
if(count>count1)System.out.println(count1);
else System.out.println(count);
}
}




