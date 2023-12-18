import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] nums = new int[n+m];
        int i = 0;
        while (i<n){
            nums[i] = 2;
            i++;
        }
        while (i<n+m){
            nums[i] = 1;
            i++;
        }
        int count = 0;
        for(int j = 0; j<nums.length; j++){
            for(int k = j+1; k<nums.length; k++){
                if((nums[j]+nums[k])%2 == 0){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}