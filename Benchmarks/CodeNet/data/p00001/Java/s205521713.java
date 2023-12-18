public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x= new int[3];
		int temp =0;
		for(int i=0; i<10; i++){
		     temp =Integer.parseInt(args[i]);
		     if(temp>x[0]){
		    	 x[2]=x[1];
		    	 x[1]=x[0];
		    	 x[0]=temp;
		     }else if(temp>x[1]){
		    	 x[2]=x[1];
		    	 x[1]=temp;
		     }else if(temp>x[2]){
		    	 x[2]=temp;
		     }
		}
		
		for(int i =0; i<3; i++){
        System.out.println(x[i]);
		}
	}

}