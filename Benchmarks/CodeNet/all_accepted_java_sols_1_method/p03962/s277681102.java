import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        int ret = 3;
        if(a==b)
            ret--;
        if(a==c)
            ret--;
        if(b==c)
            ret--;
        if(ret==0)
            ret =1;
        System.out.println(ret);
    }
    
 }