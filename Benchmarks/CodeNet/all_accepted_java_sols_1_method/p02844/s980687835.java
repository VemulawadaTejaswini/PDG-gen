import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String s=sc.next();
		int ans=0;
		for(int i=0; i<10; i++){
			for(int j=0; j<10;j++){
				for(int k=0; k<10; k++){
					int[] se={i,j,k};
					int index=0;
					for(int p=0; p<n; p++){
						if(se[index]==s.charAt(p)-'0'){
							index++;
							if(index==3){
								ans++;
								break;
							}
						}
					}
				}
			}
		}
		System.out.println(ans);
	}
}
