import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int hp = Integer.parseInt(sc.next());
        int at = Integer.parseInt(sc.next());
        if(hp % at == 0){
            System.out.println(hp/at);
        }else{
        System.out.println(hp / at + 1);
        }
    } 
}