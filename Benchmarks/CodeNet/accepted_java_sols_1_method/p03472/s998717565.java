import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hp = sc.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for(int i = 0; i < n ; i++) {
            arrA[i] = sc.nextInt();
            arrB[i] = sc.nextInt();
        }

        Arrays.sort(arrA);
        Arrays.sort(arrB);
        int count = 0;
        for (int i = n-1; i >= 0; i--){
            if(arrA[n-1] < arrB[i]){
                hp -= arrB[i];
                count++;
                if (hp <= 0){
                    break;
                }
            }
        }
        while(hp > 0){
            hp -=arrA[n-1];
            count++;
        }


        System.out.println(count);
    }


}