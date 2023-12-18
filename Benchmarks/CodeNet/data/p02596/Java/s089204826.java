import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
        int ans = -1;
        int d = 7%a;
        for(int i=0;i<a;i++){if(d==0){ans=i+1;break;}
                            }
		System.out.println(ans);
}
