import java.util.*;

public class Main{
   public static void main(String[] args) {
	  Scanner sc =new Scanner(System.in);
   while(sc.hasNext()){
String s=sc.nextLine();
String in[]=s.split(",");
	   
int a=Integer.parseInt(in[0]);	   
double b=Double.parseDouble(in[1]);
double c=Double.parseDouble(in[2]);
c*=c;
if(b/c>=25)System.out.println(a);
   }
   }
   }