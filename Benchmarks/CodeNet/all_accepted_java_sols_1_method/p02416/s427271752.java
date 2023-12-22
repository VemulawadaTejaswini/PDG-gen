import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        for(;;){
            String x = sc.next();
            sc.nextLine();
            if(x.charAt(0) == '0') break;
            int n = 0;
            for(int i=0;i<x.length();i++){
                n += x.charAt(i);
                n -= 48;
            }
            System.out.println(n);
        }
    }
}
