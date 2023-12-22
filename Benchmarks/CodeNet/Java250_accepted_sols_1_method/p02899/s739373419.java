import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        int [] ans = new int [a];
        for(int i=0;i<a;i++){
                             in[i] = sc.nextInt();
                            }
		for(int i=0;i<a;i++){ans[in[i]-1] = i+1;}
		for(int i=0;i<a;i++){System.out.println(ans[i]);}
	}
}
