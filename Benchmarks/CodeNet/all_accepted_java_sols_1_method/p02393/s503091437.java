import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
        int c=sc.nextInt();
        int cop;
        
        if(a>b) {
            cop=a;
            a=b;
            b=cop;
            if(b>c) {
                cop=b;
                b=c;
                c=cop;
                if(a>b) {
                    cop=a;
                    a=b;
                    b=cop;
                    System.out.println(a+" "+b+" "+c);
                }else {
                    System.out.println(a+" "+b+" "+c);
                }
            }else {
                System.out.println(a+" "+b+" "+c);
            }
        }else if(b>c) {
            cop=b;
            b=c;
            c=cop;
            if(a>b) {
                cop=a;
                a=b;
                b=cop;
                System.out.println(a+" "+b+" "+c);
            }
            else {
                System.out.println(a+" "+b+" "+c);
            }
        }else {
            System.out.println(a+" "+b+" "+c);
        }
 
 
    }
 
}
