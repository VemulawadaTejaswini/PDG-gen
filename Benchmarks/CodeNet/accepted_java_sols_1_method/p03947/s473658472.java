import java.util.*;
public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char c[]=sc.next().toCharArray();
		int n=c.length;
		String ans="";
		for(int i=0;i<n;i++){
			
			char a=c[i];
			
			for(int j=i+1;j<n;j++){
				if(c[j]==a){
					if(j==n-1){
						i=n-1;
					}
					c[j]='\0';
					continue;
				}else{
					
					i=j-1;
					break;
				}
			}
						
			
		}
		long sum=0;
		for(int i=0;i<n;i++){
			if(c[i]!='\0'){
				sum++;
			}
		}
		//System.out.println(Arrays.toString(c));
		System.out.println(sum-1);
		
		
	}

}
