import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int s = scanner.nextInt();
        int h=s/3600;
        s=s%3600;
        int m=s/60;
        s=s%60;
        System.out.println(h+":"+m+":"+s);
    }
}

