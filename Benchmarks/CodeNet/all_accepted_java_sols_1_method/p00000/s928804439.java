
class Main{
    public static void main(String[] a){
    	int b=1;
    	int c=1;
    	do{
    		if(c<10){
    		System.out.println(b+"x"+c+"="+b*c);
    			c++;
    		}
    		else if(c>9){
    			b++;
    			c=1;
    		}
    	}while(b<10);

    }
}