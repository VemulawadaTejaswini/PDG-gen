import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int c = Math.abs(a-b);

        int towera = 0;
        int towerb = 0;
        for(int i =1;i<c;i++){
            towera += i;
            // towerb += i;
            // if(i == c){
            //     towerb += c+1;
            // }
        }

        System.out.println(towera-a);

    }
}