import java.util.Scanner;
public class Main{
    public static void main(String args[]){
        int x;
        Scanner inp= new Scanner(System.in);
        x=inp.nextInt();
        if(x>=30){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
}
