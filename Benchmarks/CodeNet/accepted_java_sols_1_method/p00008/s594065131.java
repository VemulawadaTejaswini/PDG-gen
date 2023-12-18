import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int count;
		int n;
		
		while(true){
			count = 0;
			if(!sc.hasNext())break;
			n = sc.nextInt();
			for(int i=0;i<10;i++){
				for(int j=0;j<10;j++){
					for(int k=0;k<10;k++){
						for(int l=0;l<10;l++){
							if(i+j+k+l == n)++count;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
}