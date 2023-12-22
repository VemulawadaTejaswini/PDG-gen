import java.util.*;

class Main {
	public static void main (String [] args){
		printAns();	
	}

	static void isRightTriangle(int a, int b, int c){
		if(a*a + b*b == c*c) System.out.println("YES");
		else System.out.println("NO");
	}

	static void printAns(){
		Scanner sc = new Scanner(System.in);
		int set = sc.nextInt();
		int[] triangle = new int[3];

		for(int cnt=0; cnt<set; cnt++){
			for(int i=0; i<triangle.length; i++){
				triangle[i] = sc.nextInt();
			}
			sort(triangle);
			isRightTriangle(triangle[0], triangle[1], triangle[2]);
		}	
	}

	static void sort(int[] data){
		int min, tmp;
		for(int i=0; i<data.length; i++){
			min = i;
			for(int j=i+1; j<data.length; j++)
				if(data[min]>data[j]) min = j;
			tmp = data[i];
			data[i] = data[min];
			data[min] = tmp;
		}
	}	
}