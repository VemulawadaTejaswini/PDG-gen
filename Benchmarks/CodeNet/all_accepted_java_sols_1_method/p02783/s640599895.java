import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int health = scan.nextInt();
        int damage = scan.nextInt();
        if(health%damage==0){
            System.out.println(health/damage);
        }   else{
            System.out.println(health/damage+1);
        }
    }
}
