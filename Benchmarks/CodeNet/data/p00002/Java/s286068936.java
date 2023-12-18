class Main{
    public static void main(String[] args){
    	int a[]={5,1,1000};
    	int b[]={7,9,999};
    	int numa,numb,numc=0;
    	int digit[] = {0,0,0};
    	
    	for(int i=0;i<a.length;i++){
    		numa=a[i];
    		numb=b[i];
    		numc=numa+numb;
    		if(numc<10){
    			digit[i]=1;
    		} else if(numc<100){
    			digit[i]=2;
    		} else if(numc<1000){
    			digit[i]=3;
    		} else if(numc<10000){
    			digit[i]=4;
    		}
    	}
    	System.out.println(digit[0]);
    	System.out.println(digit[1]);
    	System.out.println(digit[2]);
    }
}