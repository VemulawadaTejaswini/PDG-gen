import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int cnt=0;
			int n=sc.nextInt();
			if(n>50) break;
			for(int i1=0;i1<=n;i1++){
				if(i1>9) continue;
				for(int i2=0;i2<=n-i1;i2++){
					if(i2>9) continue;
					for(int i3=0;i3<=n-i1-i2;i3++){
						if(i3>9) continue;
						if(n-i1-i2-i3>9) continue;
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
		sc.close();
	}
}