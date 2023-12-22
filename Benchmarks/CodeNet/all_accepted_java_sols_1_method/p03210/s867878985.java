import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner a = new Scanner(System.in);
        int i = a.nextInt();
        if(i==3 || i==5 || i==7){
        System.out.println("YES");
    }else{
        System.out.println("NO");
        }
    a.close();
    }
}