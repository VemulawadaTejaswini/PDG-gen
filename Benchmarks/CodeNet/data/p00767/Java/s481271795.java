import java.util.*;
 
public class Main {
	     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int[][] a = new int[11175][2];
		for(int i=1;i<=150;i++){
			for(int j=i+1;j<=150;j++){
				a[cnt][0] = i;
				a[cnt][1] = j;
				cnt++;
			}
		}
		
		Arrays.sort(a, new Comparator<int[]>(){
			public int compare(int[] o1, int[] o2) {
				if(o1[0]*o1[0]+o1[1]*o1[1]==o2[0]*o2[0]+o2[1]*o2[1] && o1[0]<o2[0]) return 1;
				return (o1[0]*o1[0]+o1[1]*o1[1]) - (o2[0]*o2[0]+o2[1]*o2[1]);
			}
		});
		
		while(true){
			int h = sc.nextInt();
			int w = sc.nextInt();
			if(h==0 && w==0) break;
			
			for(int i=0;i<11175;i++){
				if(a[i][0]==h && a[i][1]==w){
					System.out.println(a[i+1][0] + " " + a[i+1][1]);
					break;
				}
			}
		}
    }   
}