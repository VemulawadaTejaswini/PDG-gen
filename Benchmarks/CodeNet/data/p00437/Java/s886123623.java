import java.util.*;

public class Main {
	public static void main(String args[]){
		int a,b,c, N;//
		while(true){
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
			if(a==0&&b==0&&c==0){
				break;
			}
			N = sc.nextInt();
			int[] checking = new int[a+b+c];
			LinkedList<Integer>temp = new LinkedList<Integer>();
			Arrays.fill(checking, 0);
			for(int j=0;j<2;j++){
				for(int i=0;i<N;i++){
					if(j==0){
					int a1,b1,c1,check;
					a1 = sc.nextInt();
					b1 = sc.nextInt();
					c1 = sc.nextInt();
					check = sc.nextInt();
						if(check==1){
							checking[a1-1] = 1;
							checking[b1-1] = 1;
							checking[c1-1] = 1;
						}else{
							temp.add(a1);
							temp.add(b1);
							temp.add(c1);
						}
					}else{//j==1
						if(temp.isEmpty()){
							break;
						}
						int a2 = temp.pop();
						int b2 = temp.pop();
						int c2 = temp.pop();
						if(checking[a2-1]+checking[b2-1]+checking[c2-1]==2){
							if(checking[a2-1]!=1){
								checking[a2-1]=3;
							}else if(checking[b2-1]!=1){
								checking[b2-1] =3;
							}else{
								checking[c2-1]=3;
							}
						}
					}
				}
			}
			for(int contents : checking){
				int result;
				if(contents==3){
					result=0;
				}else if(contents==0){
					result=2;
				}else{
					result =1;
				}
				System.out.println(result);
			}
		}
	}
}