import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int tyukan = sc.nextInt();
            int kimatsu = sc.nextInt();
            int saishi = sc.nextInt();
            if(tyukan == -1 && kimatsu == -1 && saishi == -1) break;
            int sum = tyukan+kimatsu;
            if(tyukan==-1 || kimatsu==-1 || sum<30) System.out.println("F");
            else if(sum>=80) System.out.println("A");
            else if(sum>=65) System.out.println("B");
            else if(sum>=50 || (sum>=30 && saishi>=50)) System.out.println("C");
            else System.out.println("D");
        }
        sc.close();
    }

}
