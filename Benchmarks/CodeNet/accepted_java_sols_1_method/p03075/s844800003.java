import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0;i<5;i++){
            int tmp = sc.nextInt();
            min = Math.min(min, tmp);
            max = Math.max(max,tmp);
            sc.nextLine();
        }
        if(max - min > sc.nextInt()){
            System.out.println(":(");
        }else{
            System.out.println("Yay!");
        }
    }
}