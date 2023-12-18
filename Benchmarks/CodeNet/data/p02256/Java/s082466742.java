import java.util.Scanner;

class Main{

    static Scanner s;
    static int temp;

    public static void main(String args[]){
        s = new Scanner(System.in);
        
        int a = s.nextInt();
        int b = s.nextInt();
        
        
        System.out.println(gcd(a,b));
    }

    public static int gcd(int x, int y){
        if(x == y){
            return x;
        }
        else if(x == 0){
            return y;
        }
        else if (y == 0){
            return x;
        }
        else{
            if(x > y){
                return gcd(y,x%y);
            }
            else{
                return gcd(x,y%x);
            }
        }
    }
}
