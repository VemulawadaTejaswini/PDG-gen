import java.util.*;
class Main {
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		while(true){
			int x = n.nextInt();
			int y = n.nextInt();
			if(x==0&&y==0)break;
			int cnt=0;
			for(int i=1;i<=x;i++){
				for(int k=i+1;k<=x;k++){
					for(int w=k+1;w<=x;w++){
						if(i+k+w==y)cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}
}