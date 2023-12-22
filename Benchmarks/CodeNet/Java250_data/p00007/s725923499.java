import java.io.*;
import java.util.*;
  
public class Main {
  
    public static void main(String[] args)
            throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
 int sum=100000;
 
             for(int n=scan.nextInt();n>0;n--){
sum *=1.05;
int m= up3(sum);
if(m!=0)
sum+=1000-m;
}
System.out.println(sum);
}
public static int up3(int n){
return n%1000;
 
        }
}