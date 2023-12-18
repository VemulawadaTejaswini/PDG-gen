import java.util.*;

class Main{
    public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[][] iay = new long[n][n];
		HashSet<String> isyoul = new HashSet<String>();
		isyoul.add("end");
		long rt = 0;
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				iay[i][j] = sc.nextLong();
				rt += iay[i][j];
			}
		}
		for(int x=0;x<n;x++){
			for(int y=0;y<n;y++){
				for(int z=0;z<n;z++){
					if(x==y || y==z || x==z){
						continue;
					}
					if(iay[y][z] > iay[y][x] + iay[x][z]){
						rt = -1;
						x = n;
						y = n;
						break;
					}
					else if(iay[y][z] == iay[y][x] + iay[x][z]){
						isyoul.add(y + "," + z);
					}
				}
			}
		}
		if(rt!=-1){
			ArrayList<String> iisyoul = new ArrayList<>(isyoul);
			Collections.sort(iisyoul);
			for(int k=0;;k++){
				String ibx = iisyoul.get(k);
				if(ibx=="end"){
					break;
				}
				String[] spsibx = new String[2];
				spsibx = ibx.split(",");
				rt -= iay[Integer.parseInt(spsibx[0])][Integer.parseInt(spsibx[1])];				
			}
			rt /= 2;
		}
		System.out.println(rt);

    }
}
