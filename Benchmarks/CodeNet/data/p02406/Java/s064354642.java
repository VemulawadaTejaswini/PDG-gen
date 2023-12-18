import java.util.Scanner;

class Main {
    private static int a;
    
    
    public static void main(String[] args){
    
    
    
    Scanner s = new Scanner(System.in);
    
a = s.nextInt();
for(int i= 1;i<=a;i=i++)
{
    a=i;
if(a%3==0){
    System.out.println(" "+a);
    continue;
    
}while(a>0){
    if(a%10 == 3){
        System.out.println(" "+i);
        break;
    }
     a /= 10;
}
}
System.out.println(" ");    
}}

