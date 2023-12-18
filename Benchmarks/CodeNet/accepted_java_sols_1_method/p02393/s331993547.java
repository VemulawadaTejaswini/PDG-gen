import java.util.Scanner;

public class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int z = 0;
        if(a<b){
            if(b<c){
                System.out.printf("%d %d %d\n",a,b,c);
            }
            else if(a<c){
                z=a;a=b;b=z;
                System.out.printf("%d %d %d\n",a,b,c);
            }
            else{
                z=b;b=c;c=z;
                System.out.printf("%d %d %d\n",a,b,c);
            }
            
        }else{
            z=a;a=c;c=z;
            if(a>b){
            z=a;a=b;b=z;
            }
            System.out.printf("%d %d %d\n",a,b,c);
        }
            
        sc.close();
    }
    }
