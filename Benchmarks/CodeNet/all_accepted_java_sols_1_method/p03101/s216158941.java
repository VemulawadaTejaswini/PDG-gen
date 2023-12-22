import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int width =  sc.nextInt();
        int h = sc.nextInt();
        int w = sc.nextInt();

        int ans = (height * width) - (width * h) - ((height - h) * w);
        System.out.println(ans);
        
    }
}