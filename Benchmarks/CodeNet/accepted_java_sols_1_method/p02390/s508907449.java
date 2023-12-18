import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        int S = sc.nextInt();
        
        System.out.print(S/3600+":"+(S%3600)/60+":"+(S%3600)%60);
        System.out.println();
        }
}
