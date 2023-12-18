import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		char[] s1 = sc.nextLine().toCharArray();
		char[] s2 = sc.nextLine().toCharArray();
        boolean flag = true;
        for(int i=0;i<3;i++){
            flag &= s1[i]==s2[2-i];
        }
        System.out.println(flag?"YES":"NO");
	}
}