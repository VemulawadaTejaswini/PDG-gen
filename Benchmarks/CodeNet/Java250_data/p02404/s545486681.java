import java.util.*;
import java.lang.StringBuilder;
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		StringBuilder bu = new StringBuilder();
		int h,w;
		while((h=sc.nextInt())!=0&&(w=sc.nextInt())!=0){
			for(int i=1;i<=h;i++){
				for(int o=1;o<=w;o++){
					if(i==1||o==1||i==h||o==w){
						bu.append("#");
					}else{
						bu.append(".");
					}
				}
				bu.append("\n");
			}
			bu.append("\n");
		}
		System.out.print(bu);
	}
}