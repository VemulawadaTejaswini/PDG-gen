class Main{

    public void solve(){

    		for(int i = 1;i < 10; i++){
    		    for(int j = 1; j < 10; j++){
    		    	int product = i * j;
        	     	System.out.println(i+"x"+j+"="+product);
    		    }
        	}
        }



    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}