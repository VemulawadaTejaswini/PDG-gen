import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        int h,m,s;
        
        for(n >=3600){
            n -= 3600;
            h++;
        }
        
        for(m >= 60){
            n -= 60;
            m++;
        }
        s = n;
        System.out.println(h+":"+m+":"+s);
    }
}
