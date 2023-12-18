import java.io.*;
import java.util.*;
import java.math.*;
public class Main {
    public static void main(String[] args)
            throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
   long [] syatiku = new long[4001];
 boolean flag =true;
while(flag){
        int n= scan.nextInt();
if(n==0){flag =false;break;}
       for(int i=0;i<n;i++){

    syatiku[scan.nextInt()] = scan.nextLong() * scan.nextLong();
}long max =0;
int number=0;
for(int i=0;i<n;i++){
if(syatiku[i]>max){max = syatiku[i]; number =i;}
}
System.out.println(number);
}

            


   }
}