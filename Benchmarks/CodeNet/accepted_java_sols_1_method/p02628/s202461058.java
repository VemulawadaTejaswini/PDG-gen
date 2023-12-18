import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int k = sc.nextInt();
		int [] in = new int [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
		Arrays.sort(in);
        int ans = 0;
        for(int i=0;i<k;i++){ans+=in[i];
                            }
       
		System.out.println(ans);
	}
}
