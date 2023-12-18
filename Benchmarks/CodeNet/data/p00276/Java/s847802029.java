import java.util.*;

class Main{
public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
int[]a =new int[3];
int ans,q;
	q =sc.nextInt();
for(; q>0; q--){
	ans =0;
	for(int i=0; i<3; i++){
		 a[i]=sc.nextInt();
		}
	for(;;){
		if(a[0]>=1 && a[1]>=1 && a[2]>=1){
			ans++; a[0]--; a[1]--; a[2]--;
			}
		else if(a[0]>=2 && a[1]>=1){
			ans++; a[0]-=2; a[1]--;
			}
		else if(a[0]>=3){
			ans++; a[0]-=3;
		}
		else break;
	}
	System.out.println(ans);
}
}
}