import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) throws IOException{
		
		BufferedReader buf= new BufferedReader(new InputStreamReader(System.in));
		String str =buf.readLine(); //入力する桁数
		int count=Integer.parseInt(str);
		
		int[] a=new int[count];
		int[] b=new int[count];
		int[] c=new int[count];
		
		for(int i=0;i<count;i++){
			str=buf.readLine();
			a[i]=Integer.parseInt(str.split(" ")[0]);
			b[i]=Integer.parseInt(str.split(" ")[1]);
			c[i]=Integer.parseInt(str.split(" ")[2]);
		}
		buf.close();
		for(int i=0;i<count;i++){
			if(
				(a[i]*a[i]+b[i]*b[i]==c[i]*c[i])|| /*直角三角形の成立条件（ピタゴラスの定理、a＾2 + b＾2 = c＾2）*/
				(a[i]*a[i]+c[i]*c[i]==b[i]*b[i])||
				(b[i]*b[i]+c[i]*c[i]==a[i]*a[i])
				){
				System.out.println("YES");
			}else{
					System.out.println("NO");
			}
		}
	}
}