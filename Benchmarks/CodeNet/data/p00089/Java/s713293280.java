import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int ptr=0;
		int count=0;
		String[] strArray=new String[99];
		while(count<2){
			strArray[ptr]=sc.next();
			if(strArray[ptr].length()==1){
				count++;
			}
			ptr++;
		}
		int[][] step=new int[ptr][];
		for(int i=0;i<ptr;i++){
			int[] box=new int[strArray[i].length()/2+1];
			String[] s=strArray[i].split(",");
			for(int j=0;j<strArray[i].length()/2+1;j++){
				box[j]=Integer.parseInt(s[j]);
			}
			step[i]=box;
		}
		System.out.println(max(step,0,0,0));
	}
	static int max(int[][] step,int sum,int x,int y){
		if(y==step.length-1){
			return sum+step[y][x];
		}else{
			if(y<step.length/2){
				int a=max(step,sum+step[y+1][x],x,y+1);
				int b=max(step,sum+step[y+1][x+1],x+1,y+1);
				return a>b?a:b;
			}else{
				if(x==0){
					return max(step,sum+step[y+1][x],x,y+1);
				}else if(x==step[y].length-1){
					return max(step,sum+step[y+1][x-1],x-1,y+1);
				}else{
					int a=max(step,sum+step[y+1][x-1],x-1,y+1);
					int b=max(step,sum+step[y+1][x],x,y+1);
					return a>b?a:b;
				}
			}
		}
	}
}