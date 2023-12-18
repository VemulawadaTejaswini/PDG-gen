import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        double [] in = new double [a];
        double ans = 0;
        for(int i=0;i<a;i++){in[i]=sc.nextDouble();}
		for(int i=0;i<a;i++){ans+=1/in[i];}
        ans = 1/ans;
		System.out.println(ans);
	}
}
