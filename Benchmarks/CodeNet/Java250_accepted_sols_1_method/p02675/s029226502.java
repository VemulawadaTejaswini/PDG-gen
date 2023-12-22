//Therefore.java
import java.util.Scanner;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int a=Integer.parseInt(n);

        if(0<a&&a<10){
           if(a==2||a==4||a==5||a==7||a==9){
            System.out.println("hon");
           }
           if(a==1||a==6||a==8){
            System.out.println("pon");
           }
           if(a==3){
            System.out.println("bon"); 
           }
        }
        if(10<=a&&a<100){
            if(n.charAt(1)=='2'||n.charAt(1)=='4'||n.charAt(1)=='5'||n.charAt(1)=='7'||n.charAt(1)=='9'){
             System.out.println("hon");
            }
            if(n.charAt(1)=='0'||n.charAt(1)=='1'||n.charAt(1)=='6'||n.charAt(1)=='8'){
             System.out.println("pon");
            }
            if(n.charAt(1)=='3'){
             System.out.println("bon"); 
            }
        }
        if(100<=a&&a<1000){
            if(n.charAt(2)=='2'||n.charAt(2)=='4'||n.charAt(2)=='5'||n.charAt(2)=='7'||n.charAt(2)=='9'){
             System.out.println("hon");
            }
            if(n.charAt(2)=='0'||n.charAt(2)=='1'||n.charAt(2)=='6'||n.charAt(2)=='8'){
             System.out.println("pon");
            }
            if(n.charAt(2)=='3'){
             System.out.println("bon"); 
            }
        }       
        sc.close();
    }
}