public class Lesson1_2 {
	public static void main(String args[]){
		int[] height = new int[10];
		for(int n = 0; n < 10; n++){
			height[n] = new java.util.Scanner(System.in).nextInt();
		}
		for(int nr = 0; nr < 300; nr++){
			for(int lz = 0; lz < 8; lz++){
			int z1 = 0;
				if(height[lz] < height[lz+1]){
					z1 = height[lz];
					height[lz] = height[lz+1];
					height[lz+1] = z1;
				}
			}
			for(int l = 0; l < 5; l++){
				int r = 0;
				int z = 0;
				if(height[r] < height[9-r]){
					z = height[r];
					height[r] = height[9-r];
					height[9-r] = z;
				}
				r++;
			}
		}
		System.out.println("\n\n" + height[0] +"\n"+ height[1]+ "\n" + height[2] + "\n");
	}
}