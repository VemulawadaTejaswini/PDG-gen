

class Main{
    public static void main(String[] a){
    	StringBuilder s = new StringBuilder();
    	for (int i = 1; i < 10 ; i ++){
    		for (int j = 1; j < 10; j ++){
    			s.append(i + "x" + j + "=" + (i*j) +"\n" );
    		}
    	}
    	System.out.println(s);
    }
}