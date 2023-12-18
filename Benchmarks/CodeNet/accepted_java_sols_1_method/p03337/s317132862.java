import java.util.*;
class Main{
    public static void main(String[] args){
	Scanner stdIn=new Scanner(System.in);
	int A = stdIn.nextInt();
	int B = stdIn.nextInt();
	int[] ans=new int[3];
	ans[0]=A+B;
	ans[1]=A-B;
	ans[2]=A*B;
	Arrays.sort(ans);
	System.out.println(ans[2]);
    }
}
