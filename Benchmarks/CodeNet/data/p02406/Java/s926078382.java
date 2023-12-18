import java.util.Scanner;

class Main {
    private static int a,in;
    public static void main(String[] args){
    
     Scanner s = new Scanner(System.in);
    
in= s.nextInt();
for(int i= 1;i<=in;i=i++)
{
    a=i;
if(a%3==0){
    System.out.print(" "+a);
    continue;
    
}while(a>0);{
    if(a%10 == 3){
boolean sin =false;
        System.out.print(" "+i);
        sin=ture;
    }
if(sin=true) break;
     a/=10;
}
}
System.out.println(" ");    
}}

