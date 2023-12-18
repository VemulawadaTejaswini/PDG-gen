import java.util.*;

class Main{
	public static void main(Stinrg[] args){
		int over = 0;
		int count = 0;
		int under = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			String[] str = sc.nextLine().split(" ");
		//put	
			int sml = Integer.parseInt(str[0]);
			int mid = Integer.parseInt(str[1]);
			int lrg = Integer.parseInt(str[2]);
		//sort	
			while(!(sml<=mid && mid<=lrg)){
				if(sml>mid){
					int i=sml;
					sml=mid;
					mid=i;
				}
				if(mid>lrg){
					int i=mid;
					mid=lrg;
					lrg=i;
				}
			}
			
			if(lrg>(sml+mid)){
				break;
			}else if(sml*sml + mid*mid==lrg*lrg){
				count=+1;
			}else if(sml*sml+mid*mid<lrg*lrg){
				over=+1;
			}else if(sml*sml+mid*mid>lrg*lrg){
				under=+1;
			}
		}
	}
}
