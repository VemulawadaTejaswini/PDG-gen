import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		StringTokenizer st1;
		int[] tri = new int[3];
		
		str=br.readLine();

		int count=Integer.parseInt(str);


		for(int i=0;i<count;i++){
			st1=new StringTokenizer(br.readLine()," ");
			tri[0]=Integer.parseInt(st1.nextToken());
			tri[1]=Integer.parseInt(st1.nextToken());
			tri[2]=Integer.parseInt(st1.nextToken());
			sortTri(tri);
			if(tri[0]*tri[0]+tri[1]*tri[1] == tri[2]*tri[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}


	}

	public static void sortTri(int[] num){
		int tmp;
		for(int i=0;i<num.length-1;i++){
			for(int j=i+1;j<num.length;j++){
				if(num[i]>num[j]){
					tmp=num[i];
					num[i]=num[j];
					num[j]=tmp;
				}
			}
		}
	}

}