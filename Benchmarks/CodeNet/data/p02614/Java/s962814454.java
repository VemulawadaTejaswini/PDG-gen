import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main{
  public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  int h=sc.nextInt(),w=sc.nextInt(),k=sc.nextInt(),sum=0,res=0;;
	  int[][] a=new int[h][w];
	  for(int i=0;i<h;i++) {
		  String buff=sc.next();
		  for(int j=0;j<w;j++) {
			  if(buff.substring(j, j+1).equals("."))a[i][j]=0;
			  else {
				  sum++;
				  a[i][j]=1;
			  }
		  }
	  }

		for(int i=0;i<Math.pow(2, h);i++) {
			int[] s = new int[h];
			for(int j=0;j<h;j++) {//iを2進数にした場合にどこの桁が1になっているか判定し、1の場合はstatusに代入
				if((1&i>>j)==1) {
					s[j]=1;
				}
			}
			for(int g=0;g<Math.pow(2, w);g++) {
				int[] s2 = new int[w];
				int count=0;
				for(int j=0;j<w;j++) {//iを2進数にした場合にどこの桁が1になっているか判定し、1の場合はstatusに代入
					if((1&g>>j)==1) {
						s2[j]=1;
					}
				}
				Set<Integer> set=new TreeSet<>();
				for(int x=0;x<h;x++) {
					if(s[x]==1) {
						for(int r=0;r<w;r++) {
							if(a[x][r]==1) {
								count++;
								set.add(x);
							}
						}
					}
				}
				for(int y=0;y<w;y++) {
					if(s2[y]==1) {
						for(int r=0;r<h;r++) {
							if(!set.contains(r)) {
								if(a[r][y]==1)count++;
							}
						}
					}
				}
				//System.out.println(Arrays.toString(s));
				//System.out.println(Arrays.toString(s2));
				if(sum-count==k)res++;
			}
		}
	  System.out.println(res);
  }
}
