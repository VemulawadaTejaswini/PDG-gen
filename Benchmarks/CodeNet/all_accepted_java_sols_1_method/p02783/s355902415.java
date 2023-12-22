import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

            Scanner sc = new Scanner (System.in);

            int HP;
            int attack;
            int need;

            HP = sc.nextInt();
            attack = sc.nextInt();

            need = (HP + attack -1) / attack;

            if(need == 0) {
                System.out.println(1);
            }
            else if ( HP == attack){
                System.out.println(1);
            }
            else {
                System.out.println(need);
            }

        }
    }