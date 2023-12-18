public class MtTop3 {
	public static void main(String[] args){
		
		int [] yama = new int[10];
		int rinji = 0;
		
		for(int i = 0; i<yama.length; i++){
			yama[i]=(int)(Math.random()*10000);
			
			if(yama[0]<yama[i]){
				rinji=yama[0];
				yama[0]=yama[i];
				yama[i]=rinji;
				if(yama[1]<yama[i]){
					rinji=yama[1];
					yama[1]=yama[i];
					yama[i]=rinji;
					
				}
			
						}
			}
			
	    for(int i = 0; i<3; i++){
		System.out.println(yama[i]);
	    }
			
			
			}
}