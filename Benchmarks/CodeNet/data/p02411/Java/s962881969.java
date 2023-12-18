import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        while(true){
        	int m=sc.nextInt();
            int f=sc.nextInt();
            int r=sc.nextInt();
            int p=m+f;
            if(m==-1&&f==-1&&r==-1)
            	break;
            if(p>=80){
            	System.out.print("A");
            }else if(65<=p&&p<80){
            	System.out.print("B");
            }else if(50<=p&&p<65){
            	System.out.print("C");
            }else if(30<=p&&p<50&&r>=50){
            	System.out.print("C");
            }else if(30<=p&&p<50){
            	System.out.print("D");
            }else if(p<30){
            	System.out.print("F");
            }
        }
        System.out.println();
    }
}

