import java.util.*;
public class Main{
    public static void main(String[] args){
	new Main().run();
    }
    Scanner sc = new Scanner(System.in);

    int n;
    int[] nums;

    void run(){
	n = sc.nextInt();
	while(n>0){
	    n--;
	    nums = new int[10];
	    for(int i=0; i<10; i++)
		nums[i] = sc.nextInt();
	    boolean ans = solve(0, 0, 0);
	    System.out.println(ans ? "YES":"NO");
	}
    }
    boolean solve(int level, int left, int right){
	if(level==10) return true;
	
	if(left<nums[level] || right<nums[level]){
	    //System.out.println(left+" "+right);
	    if(left < nums[level])
		return solve(level+1, nums[level], right);
	    if(right < nums[level])
		return solve(level+1, left, nums[level]);
	}
	else
	    return false;
	return true;
    }
}