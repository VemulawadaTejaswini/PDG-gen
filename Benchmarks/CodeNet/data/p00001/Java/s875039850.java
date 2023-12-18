public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int[] store=new int[3];
		for(int i=0;i<10;i++){
			int s=Integer.parseInt(args[i]);
			for(int j=0;j<3;j++){
				if(s>store[j]){
					if(j==0){
						store[j+2]=store[j+1];
						store[j+1]=store[j];
						store[j]=s;
						break;
					}else if(j==1){
						store[j+1]=store[j];
						store[j]=s;
						break;
					}else{
						store[j]=s;
					}
				}
			}
		}
		for(int i=0;i<store.length;i++){
			System.out.println(store[i]);
		}
	}

}