import java.util.*;
 public class Main
{
public static void main(String[] args)
{
 
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
  int l=sc.nextInt();
  ArrayList<String> ar=new ArrayList<String>();
  for(int i=0;i<n;i++)
    ar.add(sc.next());
  Collections.sort(ar);
  for(int i=0;i<n;i++)
    System.out.print(ar.get(i));
}}
