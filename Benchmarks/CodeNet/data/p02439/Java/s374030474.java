import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] abc = new int[3];
        abc[0] = sc.nextInt();
        abc[1] = sc.nextInt();
        abc[2] = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0;i < 3;i++){
            if(max < abc[i])    max = abc[i];
            if(min > abc[i])    min = abc[i];
        }
        System.out.println(min+" "+max);
    }
}
