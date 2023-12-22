import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

int x= sc.nextInt();
if(x==1){
	System.out.println(1);
}else{
	int ans=1;

	int pre=1;
	for(int i=2; i<=x; i++){
				pre=i;
				while(pre<=x){
						pre=pre*i;
						if(pre<=x && ans<pre){
							ans = pre;
						}
				}
		}
		System.out.println(ans);
	}

	}

}
