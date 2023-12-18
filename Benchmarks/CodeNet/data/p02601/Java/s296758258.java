import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int red = sc.nextInt();
        int green = sc.nextInt();
        int blue = sc.nextInt();
        int k = sc.nextInt();
        while(k!=0){
            if(green<=red){
                green*=2;
            }
            else if(blue<=green)
                blue*=2;
            else
                break;
            k--;
        }
        if(green>red && blue>green){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}