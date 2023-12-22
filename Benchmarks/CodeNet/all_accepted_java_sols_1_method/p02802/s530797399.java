

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        int[] nums = new int[n];
        int countA = 0;
        int countW = 0;
        for(int i = 0; i < m; i++){
            int index = sc.nextInt();
            String res = sc.next();
            if(arr[index-1] == 0 && res.equals("WA")) {
                nums[index - 1]+=1;
            }else if(arr[index-1] == 0 && res.equals("AC")){
                countA += 1;
                arr[index-1] = 1;
                countW+=nums[index-1];
            }
        }
        System.out.println(countA);
        System.out.println(countW);

    }
}
