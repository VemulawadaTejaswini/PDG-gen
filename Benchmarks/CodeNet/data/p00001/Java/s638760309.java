public class KakezanKuku {
	public static void main(String[] args) {
		int[] height = {30,50,40,25,27,31,45,22,63,77};
		int obj = 0;
		for (int i = 0; i < height.length -1; i++) {
			for (int j = 0; j < height.length -i-1; j++) {
				if(height[j] < height[j+1]){
					obj = height[j];
					height[j] = height[j+1];
					height[j+1] = obj;
				}
			}
		}
		System.out.println(height[0]);
		System.out.println(height[1]);
		System.out.println(height[2]);
	}
}