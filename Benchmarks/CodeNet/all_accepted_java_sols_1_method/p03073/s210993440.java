import java.util.Scanner;
public class Main{
 public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   char[] c = sc.next().toCharArray();
 
   char[] each1 = new char[c.length];
   char[] each2 = new char[c.length];
   for(int i = 0; i<c.length;i+=2)
   {
	 each1[i] = '0';
     each2[i] = '1';  
   }
   for(int i = 1; i<c.length;i+=2)
   {
	 each1[i] = '1';
     each2[i] = '0';  
   }
   
   int ans1 =0;
   int ans2 =0;
   for(int i=0;i<c.length;i++)
   {
     if(each1[i]!=c[i]) ans1++;
     if(each2[i]!=c[i]) ans2++;
   }
 
   if(ans1>ans2) System.out.println(ans2);
   else System.out.println(ans1);
 }
}