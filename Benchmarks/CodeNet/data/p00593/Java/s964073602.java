import java.util.Scanner;
public class Main {
	public static int count=1;
	public static int a1[][]={{1}};
	public static int a2[][]={{1,2},{3,4}};
	public static int a3[][]={
		{1,2,6},
		{3,5,7},
		{4,8,9},
	};	
	public static int a4[][]={
		{1,2,6,7},
		{3,5,8,13},
		{4,9,12,14},
		{10,11,15,16}
	};
	public static int a5[][]={
		{1,2,6,7,15},
		{3,5,8,14,16},
		{4,9,13,17,22},
		{10,12,18,21,23},
		{11,19,20,24,25}
	};
	public static int a6[][]={
		{1,2,6,7,15,16},
		{3,5,8,14,17,26},
		{4,9,13,18,25,27},
		{10,12,19,24,28,33},
		{11,20,23,29,32,34},
		{21,22,30,31,35,36},
	};
	public static int a7[][]={
		{1,2,6,7,15,16,28},
		{3,5,8,14,17,27,29},
		{4,9,13,18,26,30,39},
		{10,12,19,25,31,38,40},
		{11,20,24,32,37,41,46},
		{21,23,33,36,42,45,47},
		{22,34,35,43,44,48,49},
	};
	public static int a8[][]={
		{1,2,6,7,15,16,28,29},
		{3,5,8,14,17,27,30,43},
		{4,9,13,18,26,31,42,44},
		{10,12,19,25,32,41,45,54},
		{11,20,24,33,40,46,53,55},
		{21,23,34,39,47,52,56,61},
		{22,35,38,48,51,57,60,62},
		{36,37,49,50,58,59,63,64},
	};
	public static int a9[][]={
		{1,2,6,7,15,16,28,29,45},
		{3,5,8,14,17,27,30,44,46},
		{4,9,13,18,26,31,43,47,60},
		{10,12,9,25,32,42,48,59,61},
		{11,20,24,33,41,49,58,62,71},
		{21,23,34,40,50,57,63,70,72},
		{22,35,39,51,56,64,69,73,78},
		{36,38,52,55,65,68,74,77,79},
		{37,53,54,66,67,75,76,80,81},
	};
	public static void zig(int n){
		int i,j;
		switch(n){
		case 1:
			System.out.printf("Case %d:\n",count);
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.printf("%3d",a1[i][j]);
				}
				System.out.println();
			}
			count++;
			break;
		case 2:
			System.out.printf("Case %d:\n",count);
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.printf("%3d",a2[i][j]);
				}
				System.out.println();
			}
			count++;
			break;
		case 3:
			System.out.printf("Case %d:\n",count);
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.printf("%3d",a3[i][j]);
				}
				System.out.println();
			}
			count++;
			break;
		case 4:
			System.out.printf("Case %d:\n",count);
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.printf("%3d",a4[i][j]);
				}
				System.out.println();
			}
			count++;
			break;
		case 5:
			System.out.printf("Case %d:\n",count);
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.printf("%3d",a5[i][j]);
				}
				System.out.println();
			}
			count++;
			break;
		case 6:
			System.out.printf("Case %d:\n",count);
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.printf("%3d",a6[i][j]);
				}
				System.out.println();
			}
			count++;
			break;
		case 7:
			System.out.printf("Case %d:\n",count);
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.printf("%3d",a7[i][j]);
				}
				System.out.println();
			}
			count++;
			break;
		case 8:
			System.out.printf("Case %d:\n",count);
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.printf("%3d",a8[i][j]);
				}
				System.out.println();
			}
			count++;
			break;
		case 9:
			System.out.printf("Case %d:\n",count);
			for(i=0;i<n;i++){
				for(j=0;j<n;j++){
					System.out.printf("%3d",a9[i][j]);
				}
				System.out.println();
			}
			count++;
			break;
		default:
			break;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n=sc.nextInt();
			if(n==0) break;
			zig(n);
		}
	}
}