import java.util.*;
import java.io.*;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException{
		int n;
		int[] lines=new int[3];
		int max_lines_number=0;
		BufferedReader d=new BufferedReader(new InputStreamReader(System.in));

		n=Integer.valueOf(d.readLine());//なんこの三角形を対象とするか読み取り

		for(int i=0;i<n;i++){//その回数繰り返す

			String array[] =d.readLine().split(" "); //空白区切りなので

			for(int j =0;j<3;j++){
				lines[j]=Integer.valueOf(array[j]);//Stringをintへ
			}

			for(int j =0;j<3;j++){
				if(lines[j]>=lines[max_lines_number])max_lines_number=j;//一番大きい辺の長さが入ってる配列の添字を探す
			}

			int max_line=(int) Math.pow(lines[max_lines_number],2);
			int other_lines=0;
			for(int j=0;j<3;j++){
				if(j!=max_lines_number)other_lines+=Math.pow(lines[j],2);
			}
			if(max_line==other_lines){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}


	}

}