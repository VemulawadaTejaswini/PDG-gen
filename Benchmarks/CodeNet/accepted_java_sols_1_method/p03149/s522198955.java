import java.util.*;
public class Main{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] N = new int[4];
		N[0] = scan.nextInt();
		N[1] = scan.nextInt();
        N[2] = scan.nextInt();
        N[3] = scan.nextInt();
        Arrays.sort(N);
        if(N[0]==1 && N[1]==4 && N[2]==7 && N[3]==9){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
	}
}