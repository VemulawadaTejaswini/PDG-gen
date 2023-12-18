import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int h=0,m=0,s=0;
        
        while(n >=3600){
            n -= 3600;
            h++;
        }
        
        while(m >= 60){
            n -= 60;
            m++;
        }
        s = n;
        System.out.println(h+":"+m+":"+s);
    }
}
