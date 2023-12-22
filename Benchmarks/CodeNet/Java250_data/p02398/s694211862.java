import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner br = new Scanner(System.in);
		int t=0;
		String[] str = br.nextLine().split(" ");
		int[] a=new int[str.length];
		for (int i=0;i<str.length;i++){
			a[i]=Integer.parseInt(str[i]);
		}
		for (int i=a[0];i<=a[1];i++){
			if((a[2]%i)==0){
				++t;
			}
		}
		System.out.println(t);
	}
}