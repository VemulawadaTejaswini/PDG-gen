import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] split = str.split(" ");
        int[] nums = new int[split.length];
        for(int i=0 ; i<3; i++){
            nums[i] = Integer.parseInt(split[i]);
        }
        
        for(int i=0; i<=3 ; i++){
            for(int j=i+1; j<=2; j++){
                if(nums[i]>nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j]=temp;
                }
            }
        }
        System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
    }
}
