import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int h = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        int r = sc.nextInt();
        int flag=0;
        int z;
        z=x-r;
        if (0>z) {
        	flag=1;
        }
        z=x+r;
        if (w<z) {
        	flag=1;
        }
        z=y-r;
        if (0>z) {
        	flag=1;
        }
        z=y+r;
        if (h<z) {
        	flag=1;
        }
        if (flag==0) {
        System.out.println("Yes");
        }else{
        System.out.println("No");
        }
    }
}
