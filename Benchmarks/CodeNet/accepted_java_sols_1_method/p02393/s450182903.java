import java.util.*;

public class Main {
  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

int[] nums;

nums = new int[3];

nums[0]=a;

nums[1]=b;

nums[2]=c;


Arrays.sort(nums);


System.out.println(nums[0]+" "+nums[1]+" "+nums[2]);
  }
}
