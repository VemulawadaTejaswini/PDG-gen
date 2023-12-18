import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	int keisan(int a,int b,int c,int d){
		char ctr[] = {'+','-','*'};
		for(int i = 0;i < 3;i++){
			for(int j = 0;j < 3;j++){
				for(int k = 0;k < 3;k++){
					if(calc(calc(calc(a,b,i),c,j),d,k) == 10){
						System.out.println("((("+a+" "+ctr[i]+" "+b+") "+ctr[j]+" "+c+") "+ctr[k] + " " + d +")");
						return 1;
					}else if(calc(calc(a,calc(b,c,j),i),d,k) == 10){
						System.out.println("(("+a+" "+ctr[i]+" ("+b+" "+ctr[j]+" "+c+")) "+ctr[k] + " " + d +")");
						return 1;
					}else if(calc(calc(a,b,i),calc(c,d,k),j) == 10){
						System.out.println("(("+a+" "+ctr[i]+" "+b+") "+ctr[j]+" ("+c+" "+ctr[k] + " " + d +"))");
						return 1;
					}
				}
			}
		}
		return 0;
	}
	
	int calc(int a,int b,int op){
		if(op == 0)return a+b;
		else if(op==1)return a-b;
		return a*b;
	}
	
	void doIt() {
		while(true){
			int a[] = new int [4];
			a[0] = sc.nextInt();
			a[1] = sc.nextInt();
			a[2] = sc.nextInt();
			a[3] = sc.nextInt();
			if(a[0]+a[1]+a[2]+a[3]==0)break;
			int num = 0;
			for(int i = 0;i < 4;i++){
				for(int j = 0;j < 4;j++){
					for(int k = 0;k < 4;k++){
						for(int l = 0;l < 4;l++){
							if(i == j || i == k || i == l || j == k || j == l || k == l)continue;
							num = keisan(a[i],a[j],a[k],a[l]);
							if(num == 1)break;
						}
						if(num == 1)break;
					}
					if(num == 1)break;
				}
				if(num == 1)break;
			}
			if(num == 0){
				System.out.println(0);
			}
		}
	}
    public static void main(String[] args) {
    	new Main().doIt();
    }
}