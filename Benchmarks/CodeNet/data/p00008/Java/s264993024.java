import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNextInt()){
			int n=sc.nextInt();
			for(int i1=0;i1<=n;i1++){
				for(int i2=0;i2<=n-i1;i2++){
					for(int i3=0;i3<=n-i1-i2;i3++){
						int i4=n-i1-i2-i3;
						System.out.println(i1+","+i2+","+i3+","+i4);
					}
				}
			}
		}
		sc.close();
	}
}
		sc.close();
	}
}