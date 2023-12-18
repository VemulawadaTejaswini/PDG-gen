import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int redNum = sc.nextInt();
        int greenNum = sc.nextInt();
        int blueNum = sc.nextInt();
        int operation = sc.nextInt();
        sc.close();

        int needTime = 0;
        while(greenNum<=redNum){
            greenNum = greenNum * 2;
            needTime++;
        }
        while(blueNum<=greenNum){
            blueNum = blueNum * 2;
            needTime++;
        }

        if(needTime>operation){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}