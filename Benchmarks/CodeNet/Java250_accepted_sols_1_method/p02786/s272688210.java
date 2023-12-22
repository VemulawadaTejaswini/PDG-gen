import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long H = sc.nextLong();


        long ans = 0;
        long count =0;
        long life = H;
        while(life != 0){
            life = life / 2;
            ans += Math.pow(2,count);
            count++;
        }

        System.out.println(ans);


    }

}




