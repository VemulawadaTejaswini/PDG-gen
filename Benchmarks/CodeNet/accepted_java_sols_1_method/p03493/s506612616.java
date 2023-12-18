import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		char[] a = sc.next().toCharArray();
		int ans=0;
		for (int i=0;i<3;i++){
			if (a[i]=='1'){
            	ans+=1;
            }
        }
        System.out.print(ans);
    }
}