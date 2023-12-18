import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        long L = sc.nextInt();
        long R = sc.nextInt();

        long minMod = 2019;
        if(R-L > 2020){
            System.out.println(0);
            System.exit(0);
        }

        for(long i =L;i< R;i++){
            for(long j= i+1;j< R +1;j++){
                minMod = Math.min(minMod,(i *j % 2019));
                if(minMod == 0){
                    System.out.println(0);
                    System.exit(0);
                }
            }
        }

        System.out.println(minMod);


    }



}
