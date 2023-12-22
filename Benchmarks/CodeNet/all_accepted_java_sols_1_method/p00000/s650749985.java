class Main{
    public static void main(String[] a){
        int i=1,n;
        while(true){
        	if(i<=9){
        		for(int j=1;j<=9;j++){
        			n=i*j;
        			System.out.println(i+"x"+j+"="+n);
        		}
        		i++;
        	}else{
        		break;
        	}
        	
        }
    }
}