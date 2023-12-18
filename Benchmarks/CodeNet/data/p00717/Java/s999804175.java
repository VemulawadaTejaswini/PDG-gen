import java.util.*;

public class Main {
	static ArrayList<String> list = new ArrayList<String>();
	static ArrayList<Integer> list2 = new ArrayList<Integer>();
	static int mm,m;
	static int  count=0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);


		while (true) {
			int n = sc.nextInt();
	//		System.out.println("akio"+n);
			if(n==0)break;
			m = sc.nextInt();

			int[] x = new int[m];
			int[] y = new int[m];

			for (int i = 0; i < m; i++) {
				x[i] = sc.nextInt();
				y[i] = sc.nextInt();
			}

			set(x,y);
//			for(int j=0;j<list.size();j++)System.out.println(list.get(j)+" "+list2.get(j));
			

			for (int i = 0; i < n; i++) {
				mm = sc.nextInt();
				
//				if (mm != m)
//					continue;

				int[] xx = new int[mm];
				int[] yy = new int[mm];

				for (int j = 0; j < mm; j++) {
					xx[j] = sc.nextInt();
					yy[j] = sc.nextInt();
				}
				
				if(mm!=m)continue;
				
				int[] xx2 =reverseh(xx);
				int[] yy2 = reverseh(yy);

				if(matchdesu(xx,yy)||matchdesu(xx2,yy2))System.out.println(i+1);
				
			}
			System.out.println("+++++");
		}

	}

	public static void set(int[] x, int[] y) {
		int sub = 0;
		int way = 0;
		int way2=0;
		
		list=new ArrayList<String>();
		list2=new ArrayList<Integer>();
		for (int i = 0; i < m - 1; i++) {
	//		System.out.println(x[i+1]+"      "+x[i]);
	//		System.out.println(y[i+1]+"      "+y[i]);
			if ((sub = x[i+1] - x[i]) != 0) {
				if (sub > 0)
					way = 1;
				else if (sub < 0)
					way = 2;
			} else if ((sub = y[i+1] - y[i]) != 0) {
				if (sub > 0)
					way = 3;
				else if (sub < 0)
					way = 4;
			}
			
	//		System.out.println(way);			
			
			
			if(i==0)list.add("m");
			else list.add(spin(way2,way));
			
			sub=Math.abs(sub);
			list2.add(sub);
			

			
			switch(way){
			case 1:
				way2=1;
				break;
			case 2:
				way2=2;
				break;
			case 3:
				way2=3;
				break;
			case 4:
				way2=4;
				break;
			}
						
		}
	}

	public static String spin(int past,int future){
	//	System.out.println(past+" "+future);
		if(past==1){
			if(future==3)return "L";
			if(future==4)return "R";
		}
		else if(past==2){
			if(future==3)return "R";
			if(future==4)return "L";
		}
		else if(past==3){
			if(future==1)return "R";
			if(future==2)return "L";
		}
		else if(past==4){
			if(future==1)return "L";
			if(future==2)return "R";
		}
		
		return "";
	}
	
	public static boolean matchdesu(int[] xxx, int[] yyy) {
		int sub = 0;
		int way = 0;
		int way2 = 0;
		if ((sub = xxx[1] - xxx[0]) != 0) {
			if (sub > 0)
				way2 = 1;
			else if (sub < 0)
				way2 = 2;
		} else if ((sub = yyy[1] - yyy[0]) != 0) {
			if (sub > 0)
				way2 = 3;
			else if (sub < 0)
				way2 = 4;
		}

		sub = Math.abs(sub);
		if(sub!=list2.get(0))return false;

		for (int i = 1; i < mm - 1; i++) {
			if ((sub = xxx[i + 1] - xxx[i]) != 0) {
				if (sub > 0)
					way = 1;
				else if (sub < 0)
					way = 2;
			} else if ((sub = yyy[i + 1] - yyy[i]) != 0) {
				if (sub > 0)
					way = 3;
				else if (sub < 0)
					way = 4;
			}
			
			sub = Math.abs(sub);	
			
			if(spin(way2,way)!=list.get(i))return false;
			if(sub!=list2.get(i))return false;

			switch(way){
			case 1:
				way2=1;
				break;
			case 2:
				way2=2;
				break;
			case 3:
				way2=3;
				break;
			case 4:
				way2=4;
				break;
			}
		}
		return true;

	}
	
	public static int[] reverseh(int[] x1){
		int[] sub=new int[mm];
		for(int i=0;i<mm;i++){
			sub[i]=x1[mm-1-i];
		}
		return sub;
	}

}