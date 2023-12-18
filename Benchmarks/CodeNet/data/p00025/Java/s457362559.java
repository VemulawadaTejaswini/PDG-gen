import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a=new int[4];
		int[] b=new int[4];
		while(sc.hasNextInt()){
			for(int i=0; i<4; i++){
				a[i]=sc.nextInt();
			}
			for(int j=0; j<4; j++){
				b[j]=sc.nextInt();
			}
			System.out.println(hit(a,b)+" "+blow(a,b));

		}

	}
	public static int hit(int[] a,int[] b){
		int count=0;
		for(int i=0; i<a.length; i++){
			if(a[i]==b[i]){
				count++;
			}
		}
		return count;
	}

	public static int blow(int[] a,int[] b){
		int count=0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<b.length; j++){
				if(a[i]==b[j] && i!=j){
					count++;
				}

			}
		}
		return count;
	}
}