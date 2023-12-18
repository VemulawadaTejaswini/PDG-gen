import java.util.*;

public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] an = new int[5];
        an[0] = sc.nextInt();
        an[1] = sc.nextInt();
        an[2] = sc.nextInt();
        an[3] = sc.nextInt();
        an[4] = sc.nextInt();
        int k = sc.nextInt();

        for(int i = 0;i < 5;i++){
            for(int j = i+1;j < 5;j++){
                if(Math.abs(an[i]-an[j]) > k){
                    System.out.println(":(");
                    System.exit(0);
                }
            }
        }
        System.out.println("Yay!");
    }
}
