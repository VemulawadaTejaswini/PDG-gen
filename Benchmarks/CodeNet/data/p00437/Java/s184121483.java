import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = null;
		int[][] ABC =new int[3][];//ABC[0] = A,ABC[1] = B,ABC[2] = C
		int A,B,C;
		try{
			scan = new Scanner(System.in);
			for(int i =0;i<ABC.length;i++)
				ABC[i] = new int[scan.nextInt()];
			A = ABC[0].length;
			B = ABC[1].length;
			C = ABC[2].length;
			for(int i = 0 ; i < ABC.length;i++)
				for(int j = 0; j < ABC[i].length;j++)
					ABC[i][j] = 2;
			int n = scan.nextInt();
			List<Integer[]> check = new ArrayList<Integer[]>();
			for(int i = 0; i < n;i++){
				Integer[] list = new Integer[4];
					list[0] = scan.nextInt() -1;
					list[1] = scan.nextInt() - A -1;
					list[2] = scan.nextInt() - A - B -1;
					list[3] = scan.nextInt();
				if(list[3] == 1){
					for(int j = 0 ;j < ABC.length;j++)
						ABC[j][list[j]] = 1;
				}else{
					check.add(list);
				}
			}
			while(true){
				int size = check.size();
				for(int i = 0 ;i < size;i++){
					Integer[] data = check.remove(0);
					if(!check(data,ABC))
						check.add(data);
				}
				int size2 = check.size();
				if(size == size2)break;
			}
		}finally{
			if(scan !=null)scan.close();
		}
		for(int i = 0; i < ABC.length;i++)
			for(int j = 0; j < ABC[i].length;j++)
				System.out.println(ABC[i][j]);
	}
	public static boolean check(Integer[] data , int[][] ABC){
		int A = ABC[0][data[0]];
		int B = ABC[1][data[1]];
		int C = ABC[2][data[2]];
		if(A == 1 && B == 1){
			ABC[2][data[2]] = 0;
			return true;
		}
		if(B == 1 && C == 1){
			ABC[0][data[0]] = 0;
			return true;
		}
		if(C == 1 && A == 1){
			ABC[1][data[1]] = 0;
			return true;
		}
		return false;
	}
}