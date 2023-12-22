import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		StringBuilder stc_out = new StringBuilder();
		
		for(int i=1;i<=n;i++){
			if(i%3==0){ 
				stc_out.append(" "+i);
			} else {
				int num=i;
				
				while(num!=0){
					if(num%10==3){
						stc_out.append(" "+i);
						break;
					}else{
						num=num/10;
					}//if
				}//while
			}//if	
		}//for
		System.out.println(stc_out);
	}
}