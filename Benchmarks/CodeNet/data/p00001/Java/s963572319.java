class Main{
    public static void main(String[] a){
    int height[] = {1819, 2003, 876, 2840, 1723, 1673, 3776, 2848, 1592, 922};
    int b = height.length;
    int i, j, k;
    

    for(i = 0; i < b; i++)
    
    for(j = 0;j < b-1;j++) {
    	for(i = j+1;i < b;i++) {
    		if(height[j] < height[i]) {
    			k = height[j];
    			height[j] = height[i];
    			height[i] = k;
    		}
    	}
    }
    for(i = 0; i <= 2 ; i++)
    	System.out.println(height[i] + " ");
    System.out.println();
}
}