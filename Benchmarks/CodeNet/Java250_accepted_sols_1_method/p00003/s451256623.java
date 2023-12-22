import java.util.*;
public class Main {
	public static void main(String[] args){
	 
	Scanner sc= new Scanner (System.in);
	int n = sc.nextInt();
	int i[];
	i = new int[3];
for(int count=0;count<n;count++){	
		for(int d=0;d<3;d++ ){
			i[d]=sc.nextInt();
		}
		Arrays.sort(i);
		if((i[2]*i[2])==(i[0]*i[0])+(i[1]*i[1])){
			System.out.println("YES");
		}
		else System.out.println("NO");
		}
	 
	
	}

}