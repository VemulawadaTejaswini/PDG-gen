public class Main {

	public static void main(String[] args) {
		//??????????????°
		int[] mountain ={100,200,300,400,500,600,700,800,900,900};
		int taihi;

		//??????
		for(int i=0; i<mountain.length; i++){
			for(int y = i+1; y<mountain.length; y++){
				if(mountain[i]<mountain[y]){
					taihi = mountain[i];
					mountain[i] = mountain[y];
					mountain[y] = taihi;
				}
			}
		}
		for(int x=0; x<10; x++){
			System.out.println(mountain[x]);
		}
	}
}