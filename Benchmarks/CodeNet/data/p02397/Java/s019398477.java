//?????????????????¨
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
	// TODO ?????????????????????????????????????????????
		Scanner kb=new Scanner(System.in);
int[][] a=new int[10000][2];
int i=0;
int dCount=0;
		while(true){
		a[i][0]=kb.nextInt();
		a[i][1]=kb.nextInt();
	
		if(a[i][0]==0&&a[i][1]==0){
			i++;
			dCount=i;
			break;
		}
		i++;
}
		
int oneTimeNum=0;
		for(int j=0;j<=dCount;j++){
			if(a[j][0]==0&&a[j][1]==0){
				break;
			}
		else if(a[j][0]>a[j][1]){
			oneTimeNum=a[j][0];
			a[j][0]=a[j][1];
			a[j][1]=oneTimeNum;
			System.out.printf("%d %d\n"
					,a[j][0],a[j][1]);
			continue;
			}
			System.out.printf("%d %d\n"
					,a[j][0],a[j][1]);
		}
		
	}

}