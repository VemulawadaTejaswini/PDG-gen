import java.util.Scanner;
 
public class Main{
    Scanner sc = new Scanner(System.in);
     
    void run(){
        while(sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(String.valueOf(a+b).length());
        }
    }
     
    public static void main(String[] args) {
        new Main().run();
    }
}