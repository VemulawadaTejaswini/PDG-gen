import java.util.Scanner;


public class Main{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int cnt = new Integer(s.nextLine()).intValue();
		int[][] array = new int[cnt][cnt];
		for(int i=0 ; i<cnt ; i++) {
			String[] a = s.nextLine().split(" ");
			int[] inArray = new int[a.length];
			for(int j=0 ; j<a.length ; j++ ) {
				inArray[j] = new Integer(a[j]).intValue();
			}
			array[i] = inArray;
		}
		disp(array);
	}

	public static void disp(int[][] array) {
		String[][] result = new String[array.length][4];
		for(int i=0 ; i<result.length ; i++) {
			result[i][0] = "-1";
			result[i][1] = "0";
			result[i][2] = "root";
			result[i][3] = "[]";
		}

		for(int j=0 ; j<array.length ; j++) {
			if(array[j][1] == 0){}
			else{
				if("leaf".equals(result[j][2])) {
					result[j][2] = "internal node";
				}
				String str = "[";
				for(int k=0 ; k<array[j][1] ; k++) {
					if(k+1<array[j][1]) {
						str += array[j][k+2] + ", ";
					}else {
						str += array[j][k+2] + "";
					}
				}
				result[array[j][0]][3] = str + "]";
				for(int l=0 ; l<array[j][1] ; l++) {
					//parent
					result[array[j][l+2]][0] = array[j][0]+"";
					//depth
					int tmp = (new Integer(result[array[j][0]][1]).intValue() + 1);
					result[array[j][l+2]][1] = tmp + "";
					//type
					result[array[j][l+2]][2] = "leaf";
				}
			}

		}
		for(int m=0 ; m<result.length ; m++) {
			System.out.println("node " + m + ": parent = " + result[m][0] + ", depth = " + result[m][1] + ", " + result[m][2] + ", " + result[m][3]);
		}
	}

}