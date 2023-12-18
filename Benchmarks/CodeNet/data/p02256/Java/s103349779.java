import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(gcd(x,y));
        sc.close();
    }   
    public static void swap(int x,int y){
    int tmp=x;
        x=y;
        y=tmp;
    }
    public static int gcd(int x,int y){
        if(x<y){
        swap(x,y);
    }
        while(y>0){
        int r=x%y;
            x=y;
            y=r;
        }  
        return x;
        }
    }

