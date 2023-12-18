import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int S = scan.nextInt();
       int h ;
       int m ;
       int s ;
        
       h = S/3600;
       m = (S%3600)/60;
       s = (S%3600)%60;
       System.out.println(h+":"+m+":"+s);
            }
        }
