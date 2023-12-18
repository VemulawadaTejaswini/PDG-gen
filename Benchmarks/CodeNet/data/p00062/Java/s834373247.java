import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			char[] c=sc.next().toCharArray();
			int[] a=new int[c.length];
			for(int i=0;i<c.length;i++){
				a[i]=Integer.parseInt(c[i]+"");
			}
			System.out.println(bottom(a));
		}
	}
	static int bottom(int[] a){
		if(a.length-1==0){
			return a[0];
		}else{
			int[] b=new int[a.length-1];
			for(int i=0;i<a.length-1;i++){
				b[i]=a[i]+a[i+1]-(a[i]+a[i+1])/10*10;
			}
			return bottom(b);
		}
	}
}