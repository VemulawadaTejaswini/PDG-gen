import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        if(t<0 || 86400<t){
            System.exit(-1);
        }
        System.out.println(t/3600+":"+(t%3600)/60+":"+(t%3600)%60);
    }
}