import java.util.Scanner;

public class Main{
    public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true){
        int m = sc.nextInt();
        int f = sc.nextInt();
        int r = sc.nextInt();
        int score = m+f;
        if(m==-1 && f==-1 && r==-1){
            break;
        }
        if(score<30 || m==-1 || f==-1){
            System.out.println("F");
        }else if(score>=80){
            System.out.println("A");
        }else if(score>=65){
            System.out.println("B");
        }else if(score>=50){
            System.out.println("C");
        }else if(score>=30 && r>=50){
            System.out.println("C");
        }else{
            System.out.println("D");
        }
    }
    }   
}
