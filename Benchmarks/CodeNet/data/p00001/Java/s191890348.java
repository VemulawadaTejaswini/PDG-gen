class ListOfToo3Hills{
	public static void main(String[] args){
	
	int[] data = new int[]{1819,2003,876,2840,1723,1673,3776,2848,1592,922};
	
	boolean hantei;
		do{
			hantei = false;
			for(int i = 0; i<9; i++){
				if(data[i]<data[i+1]){
					int max =0;
					max = data[i+1];
					data[i+1] = data[i];
					data[i] = max;
					hantei = true;
				}
			}
		} while(hantei);
		
		System.out.println("最も高い山の高さ"+data[0]);
		System.out.println("2番目に高い山の高さ"+data[1]);
		System.out.println("3番目に高い山の高さ"+data[2]);
	
	}
}