import java.util.Scanner;
import java.util.Arrays;

public class Main{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
long x=scan.nextLong();

int i=0;
long n=100;
while(n<x){
    n=n+n/100;
    i=i+1;
}

System.out.println(i);


}
}