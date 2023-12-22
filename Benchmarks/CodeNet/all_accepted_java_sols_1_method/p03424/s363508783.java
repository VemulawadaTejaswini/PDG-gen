import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int n=Integer.parseInt(sc.next());
HashSet<String> U=new HashSet<>();
for(int i=0;i<n;i++){U.add(sc.next());}
String ans="";
if(U.size()==3){ans="Three";}else{ans="Four";}
System.out.println(ans);
}}