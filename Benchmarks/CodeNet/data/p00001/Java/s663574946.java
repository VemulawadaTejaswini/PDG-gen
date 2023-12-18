class Main{
    public static void main(String[] a){
	int[] a = {1819,2003,876,2840,1723,1673,3776,2848,1592,922};
	int[] c = new int[10];
	for(int i=0; i<10; i++){c[i] = a[i];}
	int count = 1;
	while(count == 1){
		count = 0;
		for(int k=0; k<9; k++){
			if(a[k] < a[k+1]){
				c[k] = a[k+1];
				c[k+1]=a[k];
				for(int i=0; i<10; i++){ a[i] = c[i];}
				count = 1;
			}
		}
	}
	for(int i=0; i<3; i++){System.out.println(a[i]);}
   }
}