public class SelectSort2{
	public static void main(String[] args){
	
	
		int[] data=new int[]{1,3,2,0,9,7,8,6,4,5};
		
		for(int i=0;i<data.length-1;i++){
			int min=i;
			for(int j=i+1;j<data.length;j++){
				if(data[min]>data[j]){
					min=j;
				}
			}
			if(min!=i){
				int tmp=data[min];
				data[min]=data[i];
				data[i]=tmp;
			}
		}
		System.out.println("並べ替え後");
		for(int d: data){
			System.out.print(d+" ");
		}
	}

}