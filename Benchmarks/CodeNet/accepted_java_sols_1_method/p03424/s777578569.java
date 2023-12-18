import java.util.*;
public class Main{public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  Map<String,Integer>map=new HashMap<>();
  int n=sc.nextInt();
  for(int i=0;i<n;i++)map.put(sc.next(),1);
  System.out.println((map.size()==3)?"Three":"Four");
}}
