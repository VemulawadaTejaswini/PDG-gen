import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int nums[] = new int[3];
        
        for(int i = 0; i < nums.length; i ++) {
            nums[i] = sc.nextInt();
        }
        
        int new_num;
        for(int j = 0; j < nums.length; j ++){
            for(int k = nums.length - 1; k > j; k-- ){
                if(nums[j] > nums[k]) {
                    new_num = nums[k];
                    nums[k] = nums[j];
                    nums[j] = new_num;
                }
            }
        }
        
        System.out.println(nums[0] + " " + nums[1] + " " + nums[2]);
        
    }
}
