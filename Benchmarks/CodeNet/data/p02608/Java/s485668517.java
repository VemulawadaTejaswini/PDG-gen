import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count ;
        int num = 130;

        for(int i=1;i<=n;i++) {

            count =0;

            for (int x = 1; x <= num; x++) {
                for (int y = 1; y <= num - x; y++) {
                    for (int z = 1; z <= num - x - y; z++) {
                        long temp = (x+y+z)*(x+y+z)-((x*y)+(y*z)+(x*z));
                        if(temp==i){
                            count +=1;
                        }
                    }
                }
            }

            System.out.println(count);

        }




        scn.close();

    }


}
