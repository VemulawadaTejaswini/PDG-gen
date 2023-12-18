import java.util.*;
class  Main{
	Scanner sc= new Scanner(System.in);
	void aaaa(){
		int count=0;
		int n=sc.nextInt();
		String[] N=new String[n];
		for(int i=0;i<n;i++){
			String YN="no";
			String gundam=sc.next();
			String nakami=sc.next();
			if(gundam.equals("insert"))N[count++]=nakami;
			else {
				for(int j=0;j<n;j++){
					if(nakami.equals(N[j]))YN="yes";
				}
				System.out.println(YN);
			}
		}
	}
	public static void main(String[]args){
		new Main().aaaa();
	}
}