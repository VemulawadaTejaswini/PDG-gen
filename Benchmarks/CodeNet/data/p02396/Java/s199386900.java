import java.util.Scatter;

public class Main{
	public static void main(String[] args){
		Scatter sc = new Scatter(System.in);

		for(int i = 1;;i++){
			int x = sc.nectInt();
			if(x!=0){
			System.out.printf("Case %d: %d\n",i,x);
			}else{
				break;
			}
		}
	}
}