import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
       Scanner ob=new Scanner(System.in);
       int n=ob.nextInt();
       char[] s=ob.next().toCharArray();
       int count=0;
       int  i=0,j=s.length-1;
while(i<j)
     {
        while(i<j&&s[i]=='R'){i++;}
        while(i<j&&s[j]=='W'){j--;}
       if(i<j){s[i]='R';s[j]='W';count++;}
     }
         System.out.println(count);
     } 
}